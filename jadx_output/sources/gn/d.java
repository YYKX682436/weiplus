package gn;

/* loaded from: classes14.dex */
public class d extends androidx.recyclerview.widget.f2 implements com.tencent.mm.chatroom.ui.ie {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.TypedArray f273563d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f273564e;

    /* renamed from: f, reason: collision with root package name */
    public final gn.a f273565f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Calendar f273566g;

    /* renamed from: h, reason: collision with root package name */
    public final gn.b f273567h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Collection f273568i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f273569m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Integer f273570n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f273571o;

    public d(android.content.Context context, gn.a aVar, android.content.res.TypedArray typedArray, long j17, java.util.Collection collection) {
        this.f273563d = typedArray;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.f273566g = calendar;
        this.f273570n = java.lang.Integer.valueOf(typedArray.getInt(15, calendar.get(2) % 12));
        if (-1 != j17) {
            calendar.setTimeInMillis(j17);
        }
        this.f273569m = java.lang.Integer.valueOf(typedArray.getInt(13, calendar.get(2)));
        this.f273571o = typedArray.getBoolean(16, false);
        this.f273567h = new gn.b();
        this.f273568i = collection;
        this.f273564e = context;
        this.f273565f = aVar;
        if (typedArray.getBoolean(10, false)) {
            x(new kn.a(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        ((com.tencent.mm.chatroom.ui.SelectDateUI) this.f273565f).getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.get(2);
        int i17 = calendar.get(1);
        calendar.get(5);
        int i18 = ((i17 - this.f273566g.get(1)) + 1) * 12;
        java.lang.Integer num = this.f273569m;
        if (num.intValue() != -1) {
            i18 -= num.intValue();
        }
        java.lang.Integer num2 = this.f273570n;
        return num2.intValue() != -1 ? i18 - ((12 - num2.intValue()) - 1) : i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        com.tencent.mm.chatroom.ui.le leVar = ((gn.c) k3Var).f273562d;
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = new java.util.HashMap<>();
        java.lang.Integer num = this.f273569m;
        int i37 = i17 % 12;
        int intValue = (num.intValue() + i37) % 12;
        java.util.Calendar calendar = this.f273566g;
        int intValue2 = (i17 / 12) + calendar.get(1) + ((num.intValue() + i37) / 12);
        gn.b bVar = this.f273567h;
        java.lang.Object obj = bVar.f273560d;
        int i38 = -1;
        if (obj != null) {
            kn.a aVar = (kn.a) obj;
            i19 = aVar.f309371b;
            i27 = aVar.f309372c;
            i18 = aVar.f309373d;
        } else {
            i18 = -1;
            i19 = -1;
            i27 = -1;
        }
        java.lang.Object obj2 = bVar.f273561e;
        if (obj2 != null) {
            kn.a aVar2 = (kn.a) obj2;
            int i39 = aVar2.f309371b;
            i29 = aVar2.f309372c;
            i38 = aVar2.f309373d;
            i28 = i39;
        } else {
            i28 = -1;
            i29 = -1;
        }
        leVar.P = 6;
        leVar.requestLayout();
        hashMap.put("selected_begin_year", java.lang.Integer.valueOf(i18));
        hashMap.put("selected_last_year", java.lang.Integer.valueOf(i38));
        hashMap.put("selected_begin_month", java.lang.Integer.valueOf(i27));
        hashMap.put("selected_last_month", java.lang.Integer.valueOf(i29));
        hashMap.put("selected_begin_day", java.lang.Integer.valueOf(i19));
        hashMap.put("selected_last_day", java.lang.Integer.valueOf(i28));
        hashMap.put("year", java.lang.Integer.valueOf(intValue2));
        hashMap.put("month", java.lang.Integer.valueOf(intValue));
        calendar.setFirstDayOfWeek(1);
        hashMap.put("week_start", java.lang.Integer.valueOf(calendar.getFirstDayOfWeek()));
        leVar.setMarkDate(this.f273568i);
        leVar.setMonthParams(hashMap);
        leVar.invalidate();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new gn.c(new com.tencent.mm.chatroom.ui.le(this.f273564e, this.f273563d), this);
    }

    public void x(kn.a aVar) {
        gn.a aVar2 = this.f273565f;
        ((com.tencent.mm.chatroom.ui.SelectDateUI) aVar2).U6(aVar);
        boolean z17 = this.f273571o;
        gn.b bVar = this.f273567h;
        if (z17) {
            java.lang.Object obj = bVar.f273560d;
            if (obj != null && bVar.f273561e == null) {
                bVar.f273561e = aVar;
                if (((kn.a) obj).f309372c < aVar.f309372c) {
                    for (int i17 = 0; i17 < (((kn.a) bVar.f273560d).f309372c - aVar.f309372c) - 1; i17++) {
                        ((com.tencent.mm.chatroom.ui.SelectDateUI) aVar2).U6(aVar);
                    }
                }
                aVar2.getClass();
            } else if (bVar.f273561e != null) {
                bVar.f273560d = aVar;
                bVar.f273561e = null;
            } else {
                bVar.f273560d = aVar;
            }
        } else {
            bVar.f273560d = aVar;
        }
        notifyDataSetChanged();
    }
}
