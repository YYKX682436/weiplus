package jt0;

/* loaded from: classes15.dex */
public class e implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jt0.i f301599a;

    public e(jt0.i iVar) {
        this.f301599a = iVar;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        if (obj2 == null || obj3 == null || obj2 != obj3) {
            lt0.a aVar = lt0.a.f321162c;
            jt0.i iVar = this.f301599a;
            if (iVar.f321170e != null && obj2 != null && obj3 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BitmapResource", "let me see see");
                iVar.f321170e.a(str, obj2, obj3);
            }
            lt0.c cVar = iVar.f321168c;
            if (cVar != null) {
                lt0.i iVar2 = (lt0.i) cVar;
            }
        }
    }
}
