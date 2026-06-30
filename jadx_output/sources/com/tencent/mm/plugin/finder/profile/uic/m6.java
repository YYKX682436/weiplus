package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        super(0);
        this.f123972d = obVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity activity = this.f123972d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return (android.widget.TextView) ((jz5.n) ((com.tencent.mm.plugin.finder.profile.uic.o0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.o0.class)).f124025m).getValue();
    }
}
