package hb5;

/* loaded from: classes11.dex */
public class r0 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f280254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280255e;

    public r0(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI, android.app.ProgressDialog progressDialog) {
        this.f280255e = bizChatroomInfoUI;
        this.f280254d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f280255e.F;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f280254d;
        if (progressDialog != null) {
            s01.g aj6 = r01.q3.aj();
            com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280255e;
            aj6.D0(bizChatroomInfoUI.f197945p);
            r01.q3.Ui().y0(bizChatroomInfoUI.f197945p);
            progressDialog.dismiss();
        }
    }
}
