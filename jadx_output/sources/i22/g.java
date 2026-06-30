package i22;

/* loaded from: classes15.dex */
public final class g extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f287961f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView f287962g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f287963h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f287964i;

    /* renamed from: m, reason: collision with root package name */
    public final i22.b f287965m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, android.view.View itemView, i22.p0 p0Var) {
        super(itemView, p0Var);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f287961f = context;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.de9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f287962g = (com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView) findViewById;
        this.f287963h = jz5.h.b(new i22.f(this));
        this.f287964i = true;
        this.f287965m = new i22.b();
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        int y17;
        com.tencent.mm.plugin.emoji.model.b bVar;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        this.f288003e = item;
        boolean isEmpty = payloads.isEmpty();
        int i17 = -1;
        i22.b bVar2 = this.f287965m;
        com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView emojiStoreV3BannerView = this.f287962g;
        if (isEmpty) {
            i22.a aVar = item instanceof i22.a ? (i22.a) item : null;
            if (aVar == null) {
                return;
            }
            java.util.List list = aVar.f287922a;
            java.util.List list2 = aVar.f287923b;
            android.content.Context context = this.f287961f;
            int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f480382wd);
            h22.f fVar = new h22.f(false, false, false, 0L, 0, 0, 0, 127, null);
            fVar.f278298c = true;
            fVar.f278297b = true;
            fVar.f278301f = dimension;
            fVar.f278296a = true;
            fVar.f278302g = dimension;
            fVar.f278299d = 5000L;
            int dimension2 = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f480384wf);
            int dimension3 = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f480381wc);
            this.itemView.setBackgroundResource(com.tencent.mm.R.color.BW_93);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, dimension3);
            layoutParams.setMargins(0, dimension2, 0, 0);
            emojiStoreV3BannerView.setLayoutParams(layoutParams);
            if (this.f287964i) {
                emojiStoreV3BannerView.b(fVar, j());
                emojiStoreV3BannerView.setSizeResolver(bVar2);
            }
            j().B(j().y(list, list2));
            this.f287964i = false;
            j().f278289o = true;
            j().f278288n = aVar.f287924c + 10000;
            emojiStoreV3BannerView.a(bVar2.f288060b);
            return;
        }
        java.lang.Object obj = payloads.get(payloads.size() - 1);
        if (obj instanceof i22.i) {
            emojiStoreV3BannerView.c();
            return;
        }
        if (obj instanceof i22.j) {
            h22.h hVar = emojiStoreV3BannerView.f98492h;
            if (hVar != null) {
                hVar.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        if (obj instanceof i22.h) {
            h22.c j17 = j();
            androidx.recyclerview.widget.RecyclerView.LayoutManager currentBannerLayoutManager = emojiStoreV3BannerView.getCurrentBannerLayoutManager();
            int i18 = bVar2.f288060b + 1;
            if (currentBannerLayoutManager == null || !j17.f278289o) {
                com.tencent.mars.xlog.Log.i(j17.f278283f, "reportExpose18662 failed, recyclerview layoutManager null");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (currentBannerLayoutManager instanceof com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager) {
                i17 = ((com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager) currentBannerLayoutManager).m();
                for (int i19 = 0; i19 < i18; i19++) {
                    arrayList.add(java.lang.Integer.valueOf((i17 + i19) % j17.getItemCount()));
                }
            } else if ((currentBannerLayoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) && (i17 = (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) currentBannerLayoutManager).w()) <= (y17 = linearLayoutManager.y())) {
                int i27 = i17;
                while (true) {
                    arrayList.add(java.lang.Integer.valueOf(i27));
                    if (i27 == y17) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i28 = 0; i28 < size; i28++) {
                    int intValue = ((java.lang.Number) arrayList.get(i28)).intValue();
                    if (intValue < j17.getItemCount() && intValue >= 0 && (bVar = (com.tencent.mm.plugin.emoji.model.b) j17.f278282e.get(intValue)) != null) {
                        if (intValue != i17) {
                            sb6.append("#");
                            sb7.append("#");
                            sb8.append("#");
                        }
                        sb6.append(intValue);
                        sb7.append(j22.a.a(bVar));
                        r45.kj0 kj0Var = bVar.f97537a;
                        sb8.append(kj0Var != null ? kj0Var.f378727e : null);
                    }
                }
                int i29 = j17.f278288n;
                java.lang.String sb9 = sb6.toString();
                kotlin.jvm.internal.o.f(sb9, "toString(...)");
                java.lang.String sb10 = sb7.toString();
                kotlin.jvm.internal.o.f(sb10, "toString(...)");
                java.lang.String sb11 = sb8.toString();
                kotlin.jvm.internal.o.f(sb11, "toString(...)");
                com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct b17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
                b17.f56076j = i29;
                b17.f56072f = 1;
                b17.f56071e = 1;
                b17.f56070d = j22.a.f297249a;
                b17.p(sb9);
                b17.u(sb10);
                b17.q(sb11);
                b17.k();
            }
        }
    }

    public final h22.c j() {
        return (h22.c) ((jz5.n) this.f287963h).getValue();
    }
}
