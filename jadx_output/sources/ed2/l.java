package ed2;

/* loaded from: classes2.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final ed2.m a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(ed2.m.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ed2.m mVar = (ed2.m) a17;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        mVar.f251277d = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127645cg).getValue()).r()).booleanValue();
        return mVar;
    }
}
