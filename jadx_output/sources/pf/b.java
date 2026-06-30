package pf;

/* loaded from: classes8.dex */
public interface b extends od.p {
    void a0(pf.a aVar);

    boolean canGoBack();

    void destroy();

    android.graphics.Bitmap f();

    android.view.View getView();

    void goBack();

    void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void loadUrl(java.lang.String str);

    void loadUrl(java.lang.String str, java.util.Map map);

    void setContext(android.content.Context context);

    void setWebCore(sd.o0 o0Var);

    void stopLoading();
}
