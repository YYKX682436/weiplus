package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class fh implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e31.j f203969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f203970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203971f;

    public fh(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, e31.j jVar, boolean z17) {
        this.f203971f = chattingItemDyeingTemplate;
        this.f203969d = jVar;
        this.f203970e = z17;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17 = this.f203969d.f247075a;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f203971f;
        if (!z17) {
            g4Var.d(3, chattingItemDyeingTemplate.f203175s.s().getColor(com.tencent.mm.R.color.f478734fp), chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.hcx));
        } else if (this.f203970e) {
            g4Var.d(4, chattingItemDyeingTemplate.f203175s.s().getColor(com.tencent.mm.R.color.f479482a31), chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.hcm));
        } else {
            g4Var.d(3, chattingItemDyeingTemplate.f203175s.s().getColor(com.tencent.mm.R.color.f478734fp), chattingItemDyeingTemplate.f203175s.s().getString(com.tencent.mm.R.string.hcw));
        }
    }
}
