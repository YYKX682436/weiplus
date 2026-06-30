package db5;

/* loaded from: classes14.dex */
public class f7 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.h7 f228332a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(db5.h7 h7Var, android.os.Looper looper) {
        super(looper);
        this.f228332a = h7Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.yk.c("MicroMsg.MMTipsDialog", "mTipsBuilder handleMessage", new java.lang.Object[0]);
        db5.h7 h7Var = this.f228332a;
        android.content.Context context = h7Var.f228386f;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        h7Var.dismiss();
    }
}
