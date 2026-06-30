package hr3;

/* loaded from: classes11.dex */
public class db implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r35.a f283481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f283483c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f283484d;

    public db(hr3.eb ebVar, r35.a aVar, java.lang.String str, java.util.LinkedList linkedList) {
        this.f283484d = ebVar;
        this.f283481a = aVar;
        this.f283482b = str;
        this.f283483c = linkedList;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        hr3.eb ebVar = this.f283484d;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(ebVar.f283520f.L.d1(), true);
        java.lang.String str3 = "";
        if (n17 != null && (str2 = n17.F1) != null) {
            str3 = str2;
        }
        r35.a aVar = this.f283481a;
        aVar.m(str3);
        aVar.a(ebVar.f283520f.L.d1(), this.f283482b, this.f283483c);
    }
}
