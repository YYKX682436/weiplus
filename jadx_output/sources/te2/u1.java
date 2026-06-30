package te2;

/* loaded from: classes3.dex */
public final class u1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final r45.xg7 f418462d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.r7 f418463e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f418464f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f418465g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u1(android.content.Context r1, android.util.AttributeSet r2, int r3, sf2.e0 r4, r45.xg7 r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r0 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r2 = 0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto La
            r3 = 0
        La:
            r6 = r6 & 16
            if (r6 == 0) goto L10
            r45.xg7 r5 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend
        L10:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r1, r6)
            java.lang.String r6 = "controller"
            kotlin.jvm.internal.o.g(r4, r6)
            java.lang.String r6 = "type"
            kotlin.jvm.internal.o.g(r5, r6)
            r0.<init>(r1, r2, r3)
            r0.f418462d = r5
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            r3 = 2131495310(0x7f0c098e, float:1.8614153E38)
            r6 = 1
            r2.inflate(r3, r0, r6)
            com.tencent.mm.plugin.finder.live.widget.r7 r2 = new com.tencent.mm.plugin.finder.live.widget.r7
            r3 = 2131306934(0x7f0929b6, float:1.8232081E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r6 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r3, r6)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            te2.s1 r6 = te2.s1.f418396d
            r2.<init>(r3, r4, r5, r6)
            r0.f418463e = r2
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r2.f119584e
            r0.f418464f = r3
            java.util.Map r6 = r4.f407113o
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r5 = r6.get(r5)
            bm2.a0 r5 = (bm2.a0) r5
            r3.setAdapter(r5)
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            r5.<init>(r1)
            r3.setLayoutManager(r5)
            te2.t1 r1 = new te2.t1
            r1.<init>(r0, r4)
            ym5.a1.g(r3, r1)
            android.widget.TextView r1 = r2.f119585f
            r0.f418465g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.u1.<init>(android.content.Context, android.util.AttributeSet, int, sf2.e0, r45.xg7, int, kotlin.jvm.internal.i):void");
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getMusicRv() {
        return this.f418464f;
    }

    public final com.tencent.mm.plugin.finder.live.widget.r7 getMusicRvWidget() {
        return this.f418463e;
    }

    public final android.widget.TextView getTvNoMusic() {
        return this.f418465g;
    }

    public final r45.xg7 getType() {
        return this.f418462d;
    }
}
