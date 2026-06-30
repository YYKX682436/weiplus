package lo0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f319960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f319961b;

    /* renamed from: c, reason: collision with root package name */
    public final int f319962c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f319963d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f319964e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f319965f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f319966g;

    public b(org.json.JSONObject badgeJson) {
        kotlin.jvm.internal.o.g(badgeJson, "badgeJson");
        this.f319965f = "";
        this.f319966g = new java.util.ArrayList();
        java.lang.String optString = badgeJson.optString(dm.i4.COL_ID);
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            int optInt = badgeJson.optInt("baselineVersion");
            int optInt2 = badgeJson.optInt("currentVersion");
            java.lang.String optString2 = badgeJson.optString("group");
            this.f319960a = optString;
            this.f319961b = optInt;
            this.f319962c = optInt2;
            kotlin.jvm.internal.o.d(optString2);
            this.f319963d = optString2;
            return;
        }
        throw new lo0.u("Badge item ID is empty.");
    }

    public final void a(lo0.h handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f319966g.add(new java.lang.ref.WeakReference(handler));
    }

    public final boolean b() {
        java.lang.Integer num = this.f319964e;
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        int i17 = this.f319962c;
        int i18 = this.f319961b;
        if (i17 < i18) {
            return false;
        }
        java.lang.String str = this.f319963d;
        if (i17 > i18) {
            return (i17 == intValue && r26.i0.p(str, this.f319965f, false)) ? false : true;
        }
        if (intValue > i18) {
            return false;
        }
        if (intValue < i18) {
            return true;
        }
        return !r26.i0.p(str, this.f319965f, false);
    }

    public final void c(lo0.h handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        kz5.h0.B(this.f319966g, new lo0.a(handler));
    }

    public final void d() {
        this.f319964e = java.lang.Integer.valueOf(this.f319962c);
        this.f319965f = this.f319963d;
        java.util.List list = this.f319966g;
        java.util.Iterator it = kz5.n0.S0(list).iterator();
        while (it.hasNext()) {
            lo0.h hVar = (lo0.h) ((java.lang.ref.WeakReference) it.next()).get();
            if (hVar != null) {
                hVar.c(this);
            }
        }
        ((java.util.ArrayList) list).clear();
    }

    public b(lo0.b bVar) {
        this.f319965f = "";
        this.f319966g = new java.util.ArrayList();
        this.f319960a = bVar.f319960a;
        this.f319961b = bVar.f319961b;
        this.f319962c = bVar.f319962c;
        this.f319963d = bVar.f319963d;
    }
}
