package kp4;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f311113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView f311114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(long j17, com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView) {
        super(0);
        this.f311113d = j17;
        this.f311114e = multiTrackCropView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r3 <= (r5 + r7)) goto L10;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r11 = this;
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView r0 = r11.f311114e
            boolean r1 = r0.f176035s
            r2 = 0
            long r3 = r11.f311113d
            if (r1 == 0) goto L21
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1f
            long r5 = r0.f176036t
            r1 = 100
            long r7 = (long) r1
            long r9 = r5 - r7
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 < 0) goto L65
            long r5 = r5 + r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L65
        L1f:
            r0.f176035s = r2
        L21:
            boolean r1 = r0.f176037u
            if (r1 == 0) goto L65
            boolean r1 = r0.f176034r
            if (r1 != 0) goto L65
            long r5 = r0.f176030n
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 0
            java.lang.String r8 = "recyclerView"
            if (r1 != 0) goto L44
            int r1 = r0.f176032p
            int r3 = r0.f176029m
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView r0 = r0.f176023d
            if (r0 == 0) goto L40
            int r1 = -r1
            int r1 = r1 + r3
            r0.scrollBy(r1, r2)
            goto L65
        L40:
            kotlin.jvm.internal.o.o(r8)
            throw r7
        L44:
            int r1 = r0.f176029m
            long r3 = r3 - r5
            int r9 = r0.f176028i
            long r9 = (long) r9
            long r3 = r3 * r9
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            long r9 = r0.f176031o
            long r9 = r9 - r5
            float r4 = (float) r9
            float r3 = r3 / r4
            int r3 = (int) r3
            int r1 = r1 + r3
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView r3 = r0.f176023d
            if (r3 == 0) goto L61
            int r0 = r0.f176032p
            int r1 = r1 - r0
            r3.b1(r1, r2, r7)
            goto L65
        L61:
            kotlin.jvm.internal.o.o(r8)
            throw r7
        L65:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kp4.h0.invoke():java.lang.Object");
    }
}
