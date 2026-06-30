package y73;

/* loaded from: classes11.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459757g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f459758h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f459759i;

    public t0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.DialogInterface.OnClickListener onClickListener, android.content.DialogInterface.OnClickListener onClickListener2) {
        this.f459754d = str;
        this.f459755e = str2;
        this.f459756f = str3;
        this.f459757g = str4;
        this.f459758h = onClickListener;
        this.f459759i = onClickListener2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.GlobalAlertEvent globalAlertEvent = new com.tencent.mm.autogen.events.GlobalAlertEvent();
        q45.b bVar = new q45.b();
        bVar.f360125e = this.f459754d;
        bVar.f360126f = this.f459755e;
        bVar.f360127g = new java.util.LinkedList();
        q45.a aVar = new q45.a();
        aVar.f360122f = this.f459756f;
        bVar.f360127g.add(aVar);
        q45.a aVar2 = new q45.a();
        aVar2.f360122f = this.f459757g;
        bVar.f360127g.add(aVar2);
        am.zg zgVar = globalAlertEvent.f54424g;
        zgVar.f8564d = 1;
        zgVar.f8561a = bVar;
        zgVar.f8562b = this.f459758h;
        zgVar.f8563c = this.f459759i;
        globalAlertEvent.e();
    }
}
