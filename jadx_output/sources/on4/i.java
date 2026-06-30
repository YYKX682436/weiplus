package on4;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.TranslateMessageEvent f347110d;

    public i(on4.j jVar, com.tencent.mm.autogen.events.TranslateMessageEvent translateMessageEvent) {
        this.f347110d = translateMessageEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln4.g gVar = (ln4.g) i95.n0.c(ln4.g.class);
        gVar.requireAccountInitialized();
        am.hz hzVar = this.f347110d.f54902g;
        java.lang.String str = hzVar.f6878a;
        java.lang.String str2 = hzVar.f6879b;
        java.lang.String str3 = hzVar.f6880c;
        int i17 = hzVar.f6881d;
        int i18 = hzVar.f6882e;
        java.lang.String str4 = hzVar.f6883f;
        byte[] bArr = hzVar.f6884g;
        pn4.q1 q1Var = gVar.f319908d;
        if (q1Var.f357201e.containsKey(str3)) {
            return;
        }
        pn4.p1 p1Var = new pn4.p1(str, str2, str3, i17, i18, str4, bArr);
        ((java.util.LinkedList) q1Var.f357200d).add(p1Var);
        q1Var.f357201e.put(str3, java.lang.Integer.valueOf(p1Var.f357180j));
        q1Var.a();
    }
}
