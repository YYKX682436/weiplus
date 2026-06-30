package qx5;

/* loaded from: classes12.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.WebView f367498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367501g;

    public k0(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f367498d = webView;
        this.f367499e = str;
        this.f367500f = str2;
        this.f367501g = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f367499e;
        by5.f4.c(str, this.f367500f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        java.lang.String str3 = this.f367501g;
        sb6.append(str3.substring(0, str3.lastIndexOf(".zip")));
        sb6.append(str2);
        sb6.append("main.html");
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("XWebSavePageHelper", "loadSavedPage, htmlPath:" + sb7);
        this.f367498d.loadUrl("file://" + sb7);
    }
}
