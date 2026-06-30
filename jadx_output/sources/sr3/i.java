package sr3;

/* loaded from: classes11.dex */
public final class i implements sr3.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f411858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f411859b;

    /* renamed from: c, reason: collision with root package name */
    public final int f411860c;

    /* renamed from: d, reason: collision with root package name */
    public final sr3.f f411861d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f411862e;

    /* renamed from: f, reason: collision with root package name */
    public sr3.f f411863f;

    public i(com.tencent.mm.plugin.profile.ui.ContactInfoUI globalContext, boolean z17, long j17, int i17, sr3.f fVar) {
        kotlin.jvm.internal.o.g(globalContext, "globalContext");
        this.f411858a = z17;
        this.f411859b = j17;
        this.f411860c = i17;
        this.f411861d = fVar;
        this.f411862e = new java.lang.ref.WeakReference(globalContext);
    }

    @Override // sr3.g
    public boolean a() {
        return this.f411858a;
    }

    @Override // sr3.g
    public int b() {
        return this.f411860c;
    }

    @Override // sr3.g
    public long c() {
        return this.f411859b;
    }

    @Override // sr3.g
    public sr3.d d(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl wlVar, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, androidx.fragment.app.Fragment fragment, java.util.List currentFragments) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        kotlin.jvm.internal.o.g(currentFragments, "currentFragments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : currentFragments) {
            if (obj instanceof com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment) {
                arrayList3.add(obj);
            }
        }
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment bizProfileTabPicFragment = (com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment) kz5.n0.Z(arrayList3);
        if (wlVar != null) {
            r45.tj6 tj6Var = wlVar.D;
            boolean z18 = false;
            if (tj6Var != null && tj6Var.f386508d) {
                z18 = true;
            }
            if (z18 && bizProfileTabPicFragment == null) {
                arrayList.add(new sr3.e(h(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 1));
            }
        }
        boolean z19 = !arrayList.isEmpty();
        kz5.q0 q0Var = kz5.q0.f314001d;
        return new sr3.d(arrayList, arrayList2, q0Var, q0Var, z19);
    }

    @Override // sr3.g
    public java.util.List e(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl wlVar, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, androidx.fragment.app.Fragment fragment) {
        r45.gl glVar;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = false;
        int intExtra = context.getIntent().getIntExtra("biz_profile_tab_type", 0);
        if (intExtra > 1) {
            intExtra = 0;
        }
        if (intExtra == 1) {
            if (((wlVar == null || (glVar = wlVar.f389237h) == null || (linkedList = glVar.f375323d) == null || !linkedList.isEmpty()) ? false : true) && wlVar.f389246t != 1) {
                return arrayList;
            }
        }
        if (wlVar != null) {
            r45.tj6 tj6Var = wlVar.D;
            if (tj6Var != null && tj6Var.f386508d) {
                z18 = true;
            }
            if (z18) {
                arrayList.add(new sr3.e(h(context, contact, wlVar, dataFetcher, i17, z17, m0Var), null, 1));
            }
        }
        return arrayList;
    }

    @Override // sr3.g
    public sr3.f f(android.content.Context context, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String string;
        android.content.res.Resources resources;
        java.lang.String string2;
        android.content.res.Resources resources2;
        android.content.res.Resources resources3;
        java.lang.String str;
        java.lang.String str2;
        android.content.res.Resources resources4;
        java.lang.String string3;
        android.content.res.Resources resources5;
        android.content.res.Resources resources6;
        android.content.Context context2 = context == null ? (com.tencent.mm.plugin.profile.ui.ContactInfoUI) this.f411862e.get() : context;
        sr3.f fVar = this.f411863f;
        if (fVar != null) {
            kotlin.jvm.internal.o.d(fVar);
            return fVar;
        }
        java.lang.String str3 = null;
        if (context2 == null || (resources6 = context2.getResources()) == null || (string = resources6.getString(com.tencent.mm.R.string.f491093nf3)) == null) {
            string = (context2 == null || (resources = context2.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.f491093nf3);
        }
        if (context2 == null || (resources5 = context2.getResources()) == null || (string2 = resources5.getString(com.tencent.mm.R.string.bca)) == null) {
            string2 = (context2 == null || (resources2 = context2.getResources()) == null) ? null : resources2.getString(com.tencent.mm.R.string.bca);
        }
        if (context2 != null && (resources4 = context2.getResources()) != null && (string3 = resources4.getString(com.tencent.mm.R.string.bcc)) != null) {
            str3 = string3;
        } else if (context2 != null && (resources3 = context2.getResources()) != null) {
            str3 = resources3.getString(com.tencent.mm.R.string.bcc);
        }
        java.lang.String str4 = string == null ? "" : string;
        java.lang.String str5 = string2 == null ? "" : string2;
        java.lang.String str6 = str3 == null ? "" : str3;
        sr3.f fVar2 = this.f411861d;
        sr3.f fVar3 = new sr3.f(str4, str5, str6, (fVar2 == null || (str2 = fVar2.f411851d) == null) ? "" : str2, (fVar2 == null || (str = fVar2.f411852e) == null) ? "" : str, false, false, false, false, fVar2 != null && fVar2.f411857j);
        this.f411863f = fVar3;
        return fVar3;
    }

    @Override // sr3.g
    public sr3.a g() {
        return sr3.a.f411830f;
    }

    public final com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment h(com.tencent.mm.plugin.profile.ui.ContactInfoUI context, com.tencent.mm.storage.z3 contact, r45.wl bizProfileResp, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher dataFetcher, int i17, boolean z17, com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(bizProfileResp, "bizProfileResp");
        kotlin.jvm.internal.o.g(dataFetcher, "dataFetcher");
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment bizProfileTabPicFragment = new com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment(this.f411858a, i17, this);
        bizProfileTabPicFragment.f154413f = new r45.wl();
        bizProfileTabPicFragment.m0().D = bizProfileResp.D;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String d17 = contact.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        h73.e.d(bundle, "contact", d17);
        bizProfileTabPicFragment.setArguments(bundle);
        bizProfileTabPicFragment.B0(dataFetcher);
        bizProfileTabPicFragment.f154430t = this.f411859b;
        bizProfileTabPicFragment.f154415h = m0Var;
        bizProfileTabPicFragment.f154431u = z17;
        return bizProfileTabPicFragment;
    }
}
