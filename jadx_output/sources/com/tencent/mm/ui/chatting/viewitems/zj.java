package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class zj implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f206158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f206159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f206160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f206161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206162h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f206163i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.bk f206164m;

    public zj(com.tencent.mm.ui.chatting.viewitems.bk bkVar, java.util.Map map, boolean z17, boolean z18, android.view.View view, java.lang.String str, boolean z19) {
        this.f206164m = bkVar;
        this.f206158d = map;
        this.f206159e = z17;
        this.f206160f = z18;
        this.f206161g = view;
        this.f206162h = str;
        this.f206163i = z19;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.content.res.Resources resources;
        int i17;
        com.tencent.mm.ui.chatting.viewitems.bk bkVar = this.f206164m;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = bkVar.f203495e;
        java.lang.String str = com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate.B1;
        java.util.Map map = this.f206158d;
        boolean v07 = chattingItemDyeingTemplate.v0(map);
        boolean z17 = this.f206160f;
        boolean z18 = this.f206159e;
        android.view.View view = this.f206161g;
        if (v07 && z18 && z17) {
            if (bkVar.f203495e.G.f247082h) {
                g4Var.add(0, 9, 0, view.getResources().getString(com.tencent.mm.R.string.peg));
            } else {
                g4Var.add(0, 8, 0, view.getResources().getString(com.tencent.mm.R.string.pef));
            }
        }
        java.lang.String str2 = this.f206162h;
        if (r01.z.n(str2) && bkVar.f203495e.g1(map) && this.f206163i) {
            if (z18 && z17) {
                if (!((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) bkVar.f203495e.f203175s.f460708c.a(sb5.g.class))).n0() || com.tencent.mm.sdk.platformtools.t8.K0(bkVar.f203495e.N)) {
                    g4Var.d(0, bkVar.f203495e.f203175s.s().getColor(com.tencent.mm.R.color.f479482a31), bkVar.f203495e.f203175s.s().getString(com.tencent.mm.R.string.hcf));
                } else {
                    g4Var.d(0, bkVar.f203495e.f203175s.s().getColor(com.tencent.mm.R.color.f479482a31), java.lang.String.format(bkVar.f203495e.f203175s.s().getString(com.tencent.mm.R.string.hcg), bkVar.f203495e.N));
                }
            } else if (!((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) bkVar.f203495e.f203175s.f460708c.a(sb5.g.class))).n0() || com.tencent.mm.sdk.platformtools.t8.K0(bkVar.f203495e.N)) {
                g4Var.f(1, bkVar.f203495e.f203175s.s().getString(com.tencent.mm.R.string.hd6));
            } else {
                g4Var.f(1, java.lang.String.format(bkVar.f203495e.f203175s.s().getString(com.tencent.mm.R.string.hd7), bkVar.f203495e.N));
            }
        }
        if (((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str2)) {
            resources = view.getResources();
            i17 = com.tencent.mm.R.string.hcr;
        } else {
            resources = view.getResources();
            i17 = com.tencent.mm.R.string.hcp;
        }
        g4Var.add(0, 2, 0, resources.getString(i17));
    }
}
