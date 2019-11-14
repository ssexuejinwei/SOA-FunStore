package com.reljicd.config;

/**
 * 支付宝配置信息
 * @author linhongcun
 *
 */
public class AlipayConfig {

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ APPID（填自己的，下面都是改过的~）
    public static String app_id = "2016091900550618";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 生成公钥时对应的私钥（填自己的，下面都是改过的~）
    public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDb7jZuSU1Oh5lZmW3Cdl5LIdlZuIJ25Obmvdj/Attqgc9ewCmAbgBWkhypx4BmgTJB2x/PrF+VCN3MHwjuE6rdrw7WXHJzEuUbmi8fQ3zH0t12riEdklT7EMvayTONYlYyLewJ0/Duq+WOvteAx0myR1Uy7+ocxlC5/0YRIkS2az3Md65gbNu3YTgGeL7Jj9eH+LinRc1anVfU3kqJ344+sto5jXJ27a2Y2h8rtOdgt8nn13RDAEnsYVVY0pJH0av9RwkqS8mF/G9I7tGLTSvOck+PzNbrpmarQ3Yz+jQo1HgmoCw4sfQcBcDjdO3W1Rs3xsi2h/m9RDX25pz4WEwlAgMBAAECggEAUA2adHRsFkyXThzh7enGEtUEV3soyfwx7AVoqhIxKciMYfHSaXQg3WIb2tTKcQVP9Na88ovM0uPCUB1v07EG/eBNp0tJQYe8K1rpEhkvn1Cq2hsx5KCyHB0WBtI72JfVxjge9cjWpxmc2mOu76oasjDy2zKm5cht8/XuXCg8GKWtvzcTyZLbN+VypFmfO/k7LQvNkLRMf1vvEdcGOLXQMs1IF4jqibz5ie5+UTb8Cy8WSoisjOS2BcW93npe6gDFkOkiGhOa1iLrFgwd5je1tXxY6+dgiiLHpcZ9Ii5F2+ghv2aM2EDh14OvIvkr6oFGPCicweb/rThyhcqUoobT4QKBgQDvJpSYqAjsSuNLTSaeFdbkSBn3XGQrqn8qLkdcI2EPl3njx0KduN2Zk9FHtZnBFz4OhFjb8sU3s6ptlYVXWhwVmuLv3YqbFLmhCNxQHz9Szg1h4EfHJsGbUtPcz6Nm3CZ79j9yQnyiHU7qssIv2tMiYXNxFbY7rzWNpRTS642M7QKBgQDrbPgTXPN4qTFfAX+BR3gDI863Mw8TzLkzdXswjVz98ZYwOhHjjjzbmCx/8DdyHS9pRndW7lXN441CnQqSlxaHnEerwtjjY5o2HDHXlOyBc6vkOn1RxejoJJGxs80uRHhaTyyO1X2pC2+ly3mx1D7VSjH6nNyr7VMo0OlcnqONGQKBgBKDCQOcFjy8O0Xr7e5UwHKhRilIpJRguUE5ndp6/ptnXU8NcJGm6rhlodCMNR+mPe5/viUgcLW0GaAr78toNT5S4/gvTPheLVRSzEMDeDJfstd9tfCrhlcQnUe9ZueiaPQ1honArccav64ZMkDkDm3d30LErHuIP3v8aFU/WJCtAoGBAMXdcu6LO9IYmXcZAjn8gEBbUvykPDLO6IT4Y04eMZ748dqco7ZWMI37asMoeOE+6D8Zy2lTrOf7LRlkdaNYusXFMnOIstMCPnTl43omH1R5jGmoQvV8WdDqE02AKZ2OTHzSeEef5Rozk2WMCz7LfPe0gSb5uXoCX9c5JjkC18DZAoGALde2vqmqQrssIz/QG1NptD6XwaIYc4aUQ1GLZNK+zxHLU8zEbdsobJNplsB+fwuPO/q1547Ee6OSDtJliJ15sa7JuX4MLiny/+7PjawAyVcB1sCE0cERZ5rDAr8OdhzCJbAibFECro8VCtjMgqlQ/jvDYF8BkFMZgMY5yUgkj6s=";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String notify_url = "http://localhost:8070/home";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String return_url = "http://localhost:8070//shoppingCart/checkout";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 支付宝网关（注意沙箱alipaydev，正式则为 alipay）
    public static String url = "https://openapi.alipaydev.com/gateway.do";

    public static String charset = "UTF-8";

    public static String format = "json";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 公钥（填自己的，下面都是改过的~）
    public static String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA2+42bklNToeZWZltwnZeSyHZWbiCduTm5r3Y/wLbaoHPXsApgG4AVpIcqceAZoEyQdsfz6xflQjdzB8I7hOq3a8O1lxycxLlG5ovH0N8x9Lddq4hHZJU+xDL2skzjWJWMi3sCdPw7qvljr7XgMdJskdVMu/qHMZQuf9GESJEtms9zHeuYGzbt2E4Bni+yY/Xh/i4p0XNWp1X1N5Kid+OPrLaOY1ydu2tmNofK7TnYLfJ59d0QwBJ7GFVWNKSR9Gr/UcJKkvJhfxvSO7Ri00rznJPj8zW66Zmq0N2M/o0KNR4JqAsOLH0HAXA43Tt1tUbN8bItof5vUQ19uac+FhMJQIDAQAB";

    public static String signtype = "RSA2";

}

