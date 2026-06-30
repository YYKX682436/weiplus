package j82;

/* loaded from: classes8.dex */
public class h extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI f298157a;

    public h(com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI favOfflineWebViewUI) {
        this.f298157a = favOfflineWebViewUI;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        if (webView != null) {
            com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI favOfflineWebViewUI = this.f298157a;
            if (favOfflineWebViewUI.f100260i) {
                webView.evaluateJavascript("javascript:function setJsAcion(){document.querySelectorAll('img').forEach(function(img){img.addEventListener('click',function(){window.java_obj.doImgPreview(img.src)}) });var div = document.createElement('div');\ndiv.innerHTML = '<div style=\"padding: 8px 16px 4px;background: #FFFFFF;\"><div style=\"padding:12px 16px;background: #F7F7F7;-webkit-border-radius:4px;border-radius:4px;color: rgba(0,0,0,.5);font-size:17px;line-height:1.4;\">当前网络不可用，正在使用离线模式阅读</div></div>';\nvar parentNode = document.getElementById('js_article');\nvar oldNode = document.getElementsByClassName('rich_media_inner')[0];\nparentNode.insertBefore(div.firstChild, oldNode);}", null);
                webView.evaluateJavascript("javascript:setJsAcion()", null);
                favOfflineWebViewUI.f100260i = false;
            }
        }
    }
}
