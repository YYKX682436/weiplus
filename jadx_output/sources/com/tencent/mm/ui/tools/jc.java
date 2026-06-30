package com.tencent.mm.ui.tools;

/* loaded from: classes.dex */
public class jc implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f210520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210521e;

    public jc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, java.util.ArrayList arrayList) {
        this.f210521e = showVideoUI;
        this.f210520d = arrayList;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.g(2, this.f210521e.getString(com.tencent.mm.R.string.i8d), com.tencent.mm.R.raw.icons_outlined_download);
        this.f210520d.add(4);
    }
}
