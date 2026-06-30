package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class CustomDatePickerNew extends android.widget.FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f212191y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f212192d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f212193e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f212194f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Date f212195g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Date f212196h;

    /* renamed from: i, reason: collision with root package name */
    public int f212197i;

    /* renamed from: m, reason: collision with root package name */
    public int f212198m;

    /* renamed from: n, reason: collision with root package name */
    public int f212199n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f212200o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f212201p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f212202q;

    /* renamed from: r, reason: collision with root package name */
    public int f212203r;

    /* renamed from: s, reason: collision with root package name */
    public int f212204s;

    /* renamed from: t, reason: collision with root package name */
    public int f212205t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f212206u;

    /* renamed from: v, reason: collision with root package name */
    public int f212207v;

    /* renamed from: w, reason: collision with root package name */
    public v51.e f212208w;

    /* renamed from: x, reason: collision with root package name */
    public v51.f f212209x;

    public CustomDatePickerNew(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve));
        this.f212192d = null;
        this.f212200o = true;
        this.f212201p = true;
        this.f212202q = true;
        this.f212206u = false;
        this.f212207v = -1;
        this.f212194f = context;
        this.f212193e = new w51.g(context);
    }

    public void a() {
        if (this.f212206u) {
            this.f212203r++;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(this.f212203r, this.f212204s - 1, this.f212205t);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        if (this.f212195g == null) {
            this.f212195g = new java.util.Date(calendar.getTimeInMillis());
        }
        calendar2.setTime(this.f212195g);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        if (this.f212196h == null) {
            java.util.Calendar calendar4 = java.util.Calendar.getInstance();
            calendar4.set(this.f212203r + 100, this.f212204s - 1, this.f212205t);
            this.f212196h = new java.util.Date(calendar4.getTimeInMillis());
        }
        calendar3.setTime(this.f212196h);
        boolean z17 = this.f212206u;
        w51.g gVar = this.f212193e;
        gVar.f442978s = z17;
        w51.n nVar = gVar.f442975p;
        if (nVar != null) {
            nVar.f443011w = z17;
        }
        com.tencent.mm.ui.widget.picker.c cVar = new com.tencent.mm.ui.widget.picker.c(this);
        android.content.Context context = this.f212194f;
        t51.b bVar = new t51.b(context, cVar);
        com.tencent.mm.ui.widget.picker.b bVar2 = new com.tencent.mm.ui.widget.picker.b(this);
        u51.a aVar = bVar.f415708a;
        aVar.f424782c = bVar2;
        aVar.f424785f = false;
        aVar.f424786g = new boolean[]{this.f212202q, this.f212201p, this.f212200o, false, false, false};
        aVar.f424787h = calendar;
        bVar.b(calendar2, calendar3);
        aVar.f424794o = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        bVar.a(gVar);
        gVar.g(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480137pc));
        context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        w51.n nVar2 = gVar.f442975p;
        nVar2.getClass();
        boolean z18 = this.f212206u;
        int i17 = this.f212207v;
        if (nVar2 != null) {
            nVar2.g(z18, i17);
        }
        nVar2.f(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_1));
        gVar.h(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        java.util.Iterator it = ((java.util.ArrayList) gVar.e()).iterator();
        int i18 = 0;
        while (it.hasNext()) {
            com.tencent.mm.picker.base.view.WheelView wheelView = (com.tencent.mm.picker.base.view.WheelView) it.next();
            if (this.f212206u && this.f212203r == 2 && i18 > 0) {
                wheelView.e(0);
                wheelView.f72379d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
                wheelView.invalidate();
                wheelView.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.f478494f));
            } else {
                wheelView.e(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_9));
                wheelView.f72379d = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
                wheelView.invalidate();
                wheelView.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.f478494f));
            }
            i18++;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) gVar.e();
        if (arrayList.size() == 1) {
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            return;
        }
        if (arrayList.size() == 2) {
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        } else if (arrayList.size() == 3) {
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(0)).setPadding(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(1)).setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
            ((com.tencent.mm.picker.base.view.WheelView) arrayList.get(2)).setPadding(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn), 0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        }
    }

    public int getDayOfMonth() {
        w51.g gVar = this.f212193e;
        if (gVar != null) {
            gVar.f();
        }
        return this.f212199n;
    }

    public int getMonth() {
        w51.g gVar = this.f212193e;
        if (gVar != null) {
            gVar.f();
        }
        return this.f212198m;
    }

    public android.view.View getView() {
        if (this.f212192d == null) {
            this.f212192d = this.f212193e.d();
        }
        return this.f212192d;
    }

    public int getYear() {
        w51.g gVar = this.f212193e;
        if (gVar != null) {
            gVar.f();
        }
        return this.f212197i;
    }

    public void setLongTermYear(boolean z17) {
        this.f212206u = z17;
    }

    public void setMaxDate(java.lang.Long l17) {
        this.f212196h = new java.util.Date(l17.longValue());
    }

    public void setMinDate(java.lang.Long l17) {
        this.f212195g = new java.util.Date(l17.longValue());
    }

    public void setOnTimeSelectListener(v51.f fVar) {
        this.f212209x = fVar;
    }

    public void setTimeSelectChangeListener(v51.e eVar) {
        this.f212208w = eVar;
    }

    public CustomDatePickerNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve), attributeSet);
        this.f212192d = null;
        this.f212200o = true;
        this.f212201p = true;
        this.f212202q = true;
        this.f212206u = false;
        this.f212207v = -1;
        this.f212194f = context;
        this.f212193e = new w51.g(context);
    }

    public CustomDatePickerNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212192d = null;
        this.f212200o = true;
        this.f212201p = true;
        this.f212202q = true;
        this.f212206u = false;
        this.f212207v = -1;
        this.f212194f = context;
        this.f212193e = new w51.g(context);
    }
}
