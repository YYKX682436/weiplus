package f93;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f260332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog, android.content.Context context) {
        super(0);
        this.f260331d = absLabelUserDialog;
        this.f260332e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new f93.e(this.f260331d, this.f260332e);
    }
}
