package fj4;

/* loaded from: classes11.dex */
public final class c implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f263227d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263230g;

    /* renamed from: i, reason: collision with root package name */
    public long f263232i;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f263228e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f263229f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f263231h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f263233m = new java.util.LinkedList();

    public c(java.util.List list) {
        this.f263227d = list;
        a();
    }

    public final void a() {
        boolean z17 = true;
        java.util.List<pj4.n1> list = this.f263227d;
        if (list != null) {
            for (pj4.n1 n1Var : list) {
                mj4.h a17 = fj4.b.a(n1Var);
                this.f263231h.add(a17);
                mj4.k kVar = (mj4.k) a17;
                this.f263228e.add(kVar.h());
                if (kVar.p().length() == 0) {
                    this.f263229f.add(bk4.e1.f21460a.d());
                } else {
                    this.f263229f.add(kVar.p());
                }
                java.lang.String text_status_id = n1Var.f355199d;
                if (text_status_id != null) {
                    java.util.List list2 = this.f263233m;
                    kotlin.jvm.internal.o.f(text_status_id, "text_status_id");
                    list2.add(text_status_id);
                } else {
                    this.f263233m.add("");
                }
            }
        }
        if (!(list == null || list.isEmpty())) {
            kotlin.jvm.internal.o.d(list);
            this.f263232i = ((pj4.n1) list.get(0)).f355205m;
        }
        java.util.List list3 = this.f263231h;
        if (list3 != null && !list3.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
        java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(((mj4.k) ((mj4.h) this.f263231h.get(0))).f327067b.field_CreateTime * 1000)));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(parse);
        this.f263230g = java.lang.String.valueOf(calendar.get(5));
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
