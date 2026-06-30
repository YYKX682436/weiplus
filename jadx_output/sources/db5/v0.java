package db5;

/* loaded from: classes8.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.a1 f228549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f228550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f228551f;

    public v0(db5.a1 a1Var, com.tencent.mm.ui.widget.MMEditText mMEditText, android.content.Context context) {
        this.f228549d = a1Var;
        this.f228550e = mMEditText;
        this.f228551f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        db5.a1 a1Var = this.f228549d;
        if (a1Var != null ? a1Var.onFinish(this.f228550e.getText().toString().trim()) : true) {
            dialogInterface.dismiss();
            if (this.f228551f instanceof com.tencent.mm.ui.MMActivity) {
                com.tencent.mm.sdk.platformtools.u3.h(new db5.u0(this));
            }
        }
    }
}
