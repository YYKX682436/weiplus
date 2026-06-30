package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.ui.conversation.c8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.m0 f198815b;

    public s(com.tencent.mm.ui.chatting.component.biz.a aVar, java.lang.String str, com.tencent.mm.ui.chatting.component.biz.m0 m0Var) {
        this.f198814a = str;
        this.f198815b = m0Var;
    }

    @Override // com.tencent.mm.ui.conversation.c8, com.tencent.mm.ui.conversation.d8
    public void a(java.util.List list) {
        android.widget.ImageView imageView;
        if (list == null) {
            return;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < list.size(); i18++) {
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) list.get(i18);
            if (!l4Var.h1().equals(this.f198814a) && !c01.e2.d(l4Var.h1())) {
                i17++;
                if (i17 == 1) {
                    imageView = (android.widget.ImageView) this.f198815b.f198801f.findViewById(com.tencent.mm.R.id.aja);
                } else if (i17 == 2) {
                    imageView = (android.widget.ImageView) this.f198815b.f198801f.findViewById(com.tencent.mm.R.id.ajb);
                } else if (i17 == 3) {
                    imageView = (android.widget.ImageView) this.f198815b.f198801f.findViewById(com.tencent.mm.R.id.ajc);
                } else if (i17 != 4) {
                    break;
                } else {
                    imageView = (android.widget.ImageView) this.f198815b.f198801f.findViewById(com.tencent.mm.R.id.ajd);
                }
                if (imageView != null && (imageView.getParent() instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) imageView.getParent()).setVisibility(0);
                    imageView.setBackground(null);
                    imageView.setClickable(false);
                    imageView.setLongClickable(false);
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, l4Var.h1(), null);
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.ui.chatting.component.biz.r(this, list));
    }
}
