package d63;

@j95.b
/* loaded from: classes5.dex */
public final class e extends i95.w implements u53.b0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f226771d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f226772e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f226773f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f226774g;

    public final java.lang.String Ai(java.lang.String str, int i17) {
        v53.c cVar;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.util.LinkedList linkedList2;
        java.lang.Object obj2 = null;
        if (str == null || (cVar = ((f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(str)).field_extInfo) == null || (cVar.f433330d & (1 << (i17 - 1))) == 0) {
            return null;
        }
        m53.m h17 = com.tencent.mm.plugin.game.commlib.i.h();
        if (h17 != null && (linkedList = h17.f323889e) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((m53.h5) obj).f323754d == i17) {
                    break;
                }
            }
            m53.h5 h5Var = (m53.h5) obj;
            if (h5Var != null && (linkedList2 = h5Var.f323755e) != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (kotlin.jvm.internal.o.b(((m53.z) next).f324213d, com.tencent.mm.sdk.platformtools.m2.d())) {
                        obj2 = next;
                        break;
                    }
                }
                m53.z zVar = (m53.z) obj2;
                if (zVar != null) {
                    return zVar.f324214e;
                }
            }
        }
        return i65.a.r(com.tencent.mm.sdk.platformtools.i.a(), com.tencent.mm.R.string.fqh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((r0 == null || r0.isEmpty()) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi() {
        /*
            r8 = this;
            m53.m r0 = com.tencent.mm.plugin.game.commlib.i.h()
            r1 = 0
            if (r0 == 0) goto L78
            java.util.LinkedList r2 = r0.f323889e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L16
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L14
            goto L16
        L14:
            r5 = r3
            goto L17
        L16:
            r5 = r4
        L17:
            if (r5 == 0) goto L29
            java.util.LinkedList r0 = r0.f323888d
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L24
            goto L26
        L24:
            r0 = r3
            goto L27
        L26:
            r0 = r4
        L27:
            if (r0 != 0) goto L2b
        L29:
            r8.f226774g = r4
        L2b:
            if (r2 == 0) goto L52
            java.util.Iterator r0 = r2.iterator()
        L31:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r0.next()
            r6 = r5
            m53.h5 r6 = (m53.h5) r6
            if (r6 == 0) goto L47
            int r6 = r6.f323754d
            r7 = 2
            if (r6 != r7) goto L47
            r6 = r4
            goto L48
        L47:
            r6 = r3
        L48:
            if (r6 == 0) goto L31
            goto L4c
        L4b:
            r5 = r1
        L4c:
            m53.h5 r5 = (m53.h5) r5
            if (r5 == 0) goto L52
            r8.f226771d = r4
        L52:
            if (r2 == 0) goto L78
            java.util.Iterator r0 = r2.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r0.next()
            r5 = r2
            m53.h5 r5 = (m53.h5) r5
            if (r5 == 0) goto L6d
            int r5 = r5.f323754d
            if (r5 != r4) goto L6d
            r5 = r4
            goto L6e
        L6d:
            r5 = r3
        L6e:
            if (r5 == 0) goto L58
            goto L72
        L71:
            r2 = r1
        L72:
            m53.h5 r2 = (m53.h5) r2
            if (r2 == 0) goto L78
            r8.f226772e = r4
        L78:
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.mm.plugin.game.commlib.i.e()
            if (r0 == 0) goto L87
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.l1 r0 = r0.GameLifeSetting
            if (r0 == 0) goto L8a
            m53.e0 r1 = r0.f323865m
            goto L8a
        L87:
            com.tencent.mm.plugin.game.commlib.i.s()
        L8a:
            if (r1 == 0) goto L90
            boolean r0 = r1.f323641d
            r8.f226773f = r0
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d63.e.wi():void");
    }
}
