package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public class x implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public android.content.pm.ResolveInfo f191028d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f191029e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f191030f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f191031g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191032h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f191033i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f191034m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f191035n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Intent f191036o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Intent f191037p;

    public x(android.content.pm.ResolveInfo resolveInfo, java.lang.CharSequence charSequence, boolean z17, boolean z18, boolean z19) {
        this.f191028d = resolveInfo;
        this.f191029e = charSequence;
        this.f191032h = z17;
        this.f191033i = z18;
        this.f191034m = z19;
    }

    public boolean a(java.lang.Object obj) {
        android.content.pm.ResolveInfo resolveInfo;
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.otherway.x)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = (com.tencent.mm.pluginsdk.ui.otherway.x) obj;
        android.content.pm.ResolveInfo resolveInfo2 = xVar.f191028d;
        if (resolveInfo2 == null || (resolveInfo = this.f191028d) == null || !resolveInfo2.activityInfo.packageName.equals(resolveInfo.activityInfo.packageName)) {
            return xVar.f191032h && this.f191032h;
        }
        return true;
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
