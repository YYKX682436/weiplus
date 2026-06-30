package tm;

/* loaded from: classes8.dex */
public class b implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f420415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f420416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f420417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm.a f420418d;

    public b(tm.a aVar, android.content.DialogInterface.OnClickListener onClickListener, android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener2) {
        this.f420418d = aVar;
        this.f420415a = onClickListener;
        this.f420416b = context;
        this.f420417c = onClickListener2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (!z17) {
            android.content.DialogInterface.OnClickListener onClickListener = this.f420417c;
            if (onClickListener != null) {
                onClickListener.onClick(null, -2);
                return;
            }
            return;
        }
        android.content.DialogInterface.OnClickListener onClickListener2 = this.f420415a;
        if (onClickListener2 != null) {
            onClickListener2.onClick(null, -1);
            return;
        }
        tm.a aVar = this.f420418d;
        int i17 = aVar.f420403f;
        android.content.Context context = this.f420416b;
        if (i17 != -100) {
            java.lang.String str2 = aVar.f420398a;
            if ((str2 == null || str2.length() == 0) || context == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            if (!com.tencent.mm.sdk.platformtools.x2.n() || !gm0.j1.a()) {
                intent.putExtra("neverGetA8Key", true);
            }
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
            return;
        }
        java.lang.String str3 = aVar.f420398a;
        if ((str3 == null || str3.length() == 0) || context == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str3);
        if (!com.tencent.mm.sdk.platformtools.x2.n() || !gm0.j1.a()) {
            intent2.putExtra("neverGetA8Key", true);
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
    }
}
