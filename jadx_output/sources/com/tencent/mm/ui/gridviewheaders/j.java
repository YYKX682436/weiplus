package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.o f208750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.GridHeadersGridView f208751f;

    public j(com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView, android.view.View view, com.tencent.mm.ui.gridviewheaders.o oVar) {
        this.f208751f = gridHeadersGridView;
        this.f208749d = view;
        this.f208750e = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView = this.f208751f;
        gridHeadersGridView.f208705J = -1;
        this.f208749d.setPressed(false);
        gridHeadersGridView.setPressed(false);
        gridHeadersGridView.getClass();
        this.f208750e.run();
    }
}
