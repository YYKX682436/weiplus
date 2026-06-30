package jt0;

/* loaded from: classes15.dex */
public class f implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jt0.i f301600a;

    public f(jt0.i iVar) {
        this.f301600a = iVar;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kt0.a aVar = (kt0.a) obj2;
        kt0.a aVar2 = (kt0.a) obj3;
        if (aVar != null && aVar2 != null && aVar.equals(aVar2)) {
            lt0.a aVar3 = lt0.a.f321162c;
            return;
        }
        if (aVar2 != null && aVar != null && aVar2.f311903a.equals(aVar.f311903a)) {
            lt0.a aVar4 = lt0.a.f321162c;
            return;
        }
        lt0.a aVar5 = lt0.a.f321162c;
        java.lang.String str = aVar.f311903a;
        if (str != null) {
            this.f301600a.f321167b.remove(str);
        }
    }
}
