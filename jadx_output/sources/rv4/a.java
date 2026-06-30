package rv4;

/* loaded from: classes12.dex */
public final class a implements mv4.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f400424a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f400425b;

    /* renamed from: c, reason: collision with root package name */
    public int f400426c;

    public a(rv4.w session, android.content.Context context) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f400424a = arrayList;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f400425b = uuid;
        this.f400426c = 3;
        arrayList.add(new rv4.b(this, (rv4.g0) ((jz5.n) session.f400559e).getValue(), session));
    }

    @Override // mv4.c
    public void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f400424a).iterator();
        while (it.hasNext()) {
            rv4.b bVar = (rv4.b) ((mv4.b) it.next());
            nv4.k kVar = bVar.f400433b.f331675b;
            ov4.c a17 = bVar.a(ov4.d.f349206e);
            kVar.getClass();
            a17.toString();
            kVar.b(a17);
        }
    }

    @Override // mv4.c
    public void e(int i17) {
        this.f400426c = i17;
        int i18 = 0;
        for (java.lang.Object obj : this.f400424a) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((rv4.b) ((mv4.b) obj)).f400434c = i19;
            i18 = i19;
        }
    }
}
