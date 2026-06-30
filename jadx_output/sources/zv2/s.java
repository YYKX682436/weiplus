package zv2;

/* loaded from: classes10.dex */
public final class s extends zv2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    @Override // zv2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo r8) {
        /*
            r7 = this;
            java.lang.String r0 = "jumpInfo"
            kotlin.jvm.internal.o.g(r8, r0)
            super.d(r8)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r7.f476397f
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L42
            java.util.LinkedList r8 = r8.getStyle()
            if (r8 == 0) goto L42
            java.util.Iterator r8 = r8.iterator()
        L1a:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r8.next()
            r5 = r4
            r45.wf6 r5 = (r45.wf6) r5
            int r5 = r5.getInteger(r0)
            r6 = 5
            if (r5 != r6) goto L30
            r5 = r2
            goto L31
        L30:
            r5 = r1
        L31:
            if (r5 == 0) goto L1a
            goto L35
        L34:
            r4 = r3
        L35:
            r45.wf6 r4 = (r45.wf6) r4
            if (r4 == 0) goto L42
            r8 = 8
            com.tencent.mm.protobuf.f r8 = r4.getCustom(r8)
            r45.su r8 = (r45.su) r8
            goto L43
        L42:
            r8 = r3
        L43:
            if (r8 == 0) goto L4a
            java.lang.String r4 = r8.getString(r2)
            goto L4b
        L4a:
            r4 = r3
        L4b:
            if (r4 == 0) goto L56
            int r4 = r4.length()
            if (r4 != 0) goto L54
            goto L56
        L54:
            r4 = r1
            goto L57
        L56:
            r4 = r2
        L57:
            if (r4 == 0) goto L63
            r8 = 2131766598(0x7f102d46, float:1.916439E38)
            androidx.appcompat.app.AppCompatActivity r2 = r7.f476395d
            java.lang.String r8 = r2.getString(r8)
            goto L6d
        L63:
            if (r8 == 0) goto L6b
            java.lang.String r8 = r8.getString(r2)
            if (r8 != 0) goto L6d
        L6b:
            java.lang.String r8 = ""
        L6d:
            kotlin.jvm.internal.o.d(r8)
            com.tencent.mm.plugin.finder.view.FinderJumperView r2 = r7.f476396e
            com.tencent.mm.plugin.finder.view.FinderJumperView.c(r2, r8, r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv2.s.d(com.tencent.mm.protocal.protobuf.FinderJumpInfo):void");
    }

    @Override // zv2.b
    public void f() {
        super.f();
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.vip_filled_new);
        finderJumperView.setFilledIconId(com.tencent.mm.R.raw.vip_filled_new);
        finderJumperView.setFilledIconColor(b3.l.getColor(this.f476395d, com.tencent.mm.R.color.akk));
        finderJumperView.setFilledTextColor(false);
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f401398a.a(this.f476395d, kz5.b0.c(new ry2.f(2, com.tencent.mm.R.color.Red_100, 0, new zv2.r(this), null, 20, null)), null);
    }
}
