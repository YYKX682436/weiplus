package vk2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vk2.h f437761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vk2.h hVar) {
        super(0);
        this.f437761d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.o mo133getLifecycle;
        vk2.h hVar = this.f437761d;
        android.content.Context context = hVar.f118381d;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(hVar.f437770s);
        }
        return jz5.f0.f302826a;
    }
}
