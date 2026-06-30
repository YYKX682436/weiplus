package yj4;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj4.d f462690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yj4.d dVar) {
        super(0);
        this.f462690d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity activity = this.f462690d.getActivity();
        return new java.lang.ref.WeakReference(activity instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity ? (com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity) activity : null);
    }
}
