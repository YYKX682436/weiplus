package mz0;

/* loaded from: classes5.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(mz0.b2 b2Var) {
        super(0);
        this.f332877d = b2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance()) == 1) goto L10;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r15 = this;
            bm5.o1 r0 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance r1 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance
            r1.<init>()
            int r0 = r0.h(r1)
            r1 = 2
            java.lang.Class<e42.e0> r2 = e42.e0.class
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 == r1) goto L29
            i95.m r0 = i95.n0.c(r2)
            e42.e0 r0 = (e42.e0) r0
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance r1 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance
            r1.<init>()
            h62.d r0 = (h62.d) r0
            int r0 = r0.nj(r1)
            if (r0 != r4) goto L29
            goto L2b
        L29:
            r10 = r3
            goto L2c
        L2b:
            r10 = r4
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "enableShowMoreTemplateEntrance: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SnsMaasConfigImpl"
            com.tencent.mars.xlog.Log.i(r1, r0)
            mz0.b2 r0 = r15.f332877d
            if (r10 != 0) goto L4b
            boolean r1 = r0.q7()
            if (r1 == 0) goto L4b
            r9 = r4
            goto L4c
        L4b:
            r9 = r3
        L4c:
            i95.m r1 = i95.n0.c(r2)
            e42.e0 r1 = (e42.e0) r1
            e42.c0 r2 = e42.c0.clicfg_sns_segment_edit_selected_template_entrance
            h62.d r1 = (h62.d) r1
            boolean r11 = r1.fj(r2, r4)
            kotlinx.coroutines.y0 r6 = r0.getMainScope()
            java.util.List r7 = r0.f332886g
            jz5.g r1 = r0.f332893q
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r12 = r1.booleanValue()
            com.tencent.mm.mj_template.sns.compose.widget.m7 r1 = new com.tencent.mm.mj_template.sns.compose.widget.m7
            r8 = 0
            r13 = 4
            r14 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            mz0.y1 r2 = new mz0.y1
            r2.<init>(r0)
            r1.f70093k = r2
            az0.d r2 = r0.n7()
            r1.f70094l = r2
            mz0.z1 r2 = new mz0.z1
            r2.<init>(r0)
            r1.f70095m = r2
            com.tencent.mm.mj_template.sns.compose.widget.c7 r0 = r0.g7()
            r1.f70101s = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.a2.invoke():java.lang.Object");
    }
}
