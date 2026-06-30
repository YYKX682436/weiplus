package is2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is2.c f294433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(is2.c cVar) {
        super(0);
        this.f294433d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        is2.c cVar = this.f294433d;
        androidx.appcompat.app.AppCompatActivity activity = cVar.f294435a;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelf()) {
            androidx.appcompat.app.AppCompatActivity activity2 = cVar.f294435a;
            kotlin.jvm.internal.o.g(activity2, "activity");
            if (((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a(activity2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).isSelfFlag()) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
