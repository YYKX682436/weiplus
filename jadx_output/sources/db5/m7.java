package db5;

/* loaded from: classes.dex */
public class m7 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228440a;

    public m7(android.content.Context context) {
        this.f228440a = context;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        android.content.Context context = this.f228440a;
        if (z2.h.b((android.app.Activity) context, "android.permission.READ_EXTERNAL_STORAGE")) {
            jx3.f.INSTANCE.idkeyStat(462L, 22L, 1L, true);
            z2.h.a((android.app.Activity) context, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 32767);
        } else {
            android.content.Context context2 = this.f228440a;
            db5.e1.C(context2, context2.getString(com.tencent.mm.R.string.hhr), context.getString(com.tencent.mm.R.string.hht), context.getString(com.tencent.mm.R.string.g6z), context.getString(com.tencent.mm.R.string.f490347sg), false, new db5.k7(this), new db5.l7(this));
        }
    }
}
