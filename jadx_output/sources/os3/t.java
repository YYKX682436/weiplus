package os3;

/* loaded from: classes8.dex */
public class t implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f348199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ os3.u f348200b;

    public t(os3.u uVar, android.content.Intent intent) {
        this.f348200b = uVar;
        this.f348199a = intent;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            j45.l.v(this.f348200b.f348215a.f348220d.getContext(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", this.f348199a, 6);
        }
    }
}
