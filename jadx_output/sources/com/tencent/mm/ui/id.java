package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class id {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f208919a = {android.R.attr.text, android.R.attr.hint, android.R.attr.contentDescription};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f208920b = {android.R.attr.contentDescription};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f208921c = {android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.background};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f208922d = {android.R.attr.textColor, android.R.attr.background};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f208923e = {android.R.attr.textColor, android.R.attr.button};

    /* renamed from: f, reason: collision with root package name */
    public static int f208924f;

    public static android.view.LayoutInflater a(android.view.LayoutInflater layoutInflater, android.content.Context context) {
        i65.a.q(context);
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(context);
        com.tencent.mm.ui.fd fdVar = new com.tencent.mm.ui.fd(null);
        fdVar.f208450d = cloneInContext;
        cloneInContext.setFactory(fdVar);
        com.tencent.mm.ui.gd gdVar = new com.tencent.mm.ui.gd(cloneInContext, cloneInContext.getContext());
        com.tencent.mm.ui.fd fdVar2 = new com.tencent.mm.ui.fd(null);
        fdVar2.f208450d = gdVar;
        fdVar2.f208454h = fdVar;
        gdVar.setFactory(fdVar2);
        gdVar.f208688a = fdVar2;
        return gdVar;
    }

    public static android.view.LayoutInflater b(android.content.Context context) {
        i65.a.q(context);
        android.view.LayoutInflater cloneInContext = android.view.LayoutInflater.from(context).cloneInContext(context);
        com.tencent.mm.ui.fd fdVar = new com.tencent.mm.ui.fd(null);
        fdVar.f208450d = cloneInContext;
        cloneInContext.setFactory(fdVar);
        com.tencent.mm.ui.gd gdVar = new com.tencent.mm.ui.gd(cloneInContext, cloneInContext.getContext());
        com.tencent.mm.ui.fd fdVar2 = new com.tencent.mm.ui.fd(null);
        fdVar2.f208450d = gdVar;
        fdVar2.f208454h = fdVar;
        gdVar.setFactory(fdVar2);
        gdVar.f208688a = fdVar2;
        return gdVar;
    }

    public static android.view.LayoutInflater c(android.view.LayoutInflater layoutInflater) {
        i65.a.q(layoutInflater.getContext());
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(layoutInflater.getContext());
        com.tencent.mm.ui.fd fdVar = new com.tencent.mm.ui.fd(null);
        fdVar.f208450d = cloneInContext;
        cloneInContext.setFactory(fdVar);
        com.tencent.mm.ui.gd gdVar = new com.tencent.mm.ui.gd(cloneInContext, cloneInContext.getContext());
        com.tencent.mm.ui.fd fdVar2 = new com.tencent.mm.ui.fd(null);
        fdVar2.f208450d = gdVar;
        fdVar2.f208454h = fdVar;
        gdVar.setFactory(fdVar2);
        gdVar.f208688a = fdVar2;
        return gdVar;
    }
}
