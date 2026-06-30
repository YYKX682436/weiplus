package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ub {

    /* renamed from: a, reason: collision with root package name */
    public kotlinx.coroutines.r2 f201499a;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if ((r7 != null && r7.i()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.tencent.mm.ui.chatting.gallery.nb a(com.tencent.mm.ui.chatting.gallery.ub r6, java.lang.String r7, yz5.a r8) {
        /*
            r6.getClass()
            long r1 = com.tencent.mm.vfs.w6.k(r7)
            java.lang.Object r6 = r8.invoke()
            com.tencent.mm.ui.chatting.gallery.mb r6 = (com.tencent.mm.ui.chatting.gallery.mb) r6
            com.tencent.mm.storage.f9 r7 = r6.f201206d
            r3 = 0
            r8 = 0
            if (r7 == 0) goto L4f
            java.lang.Class<wf0.x1> r0 = wf0.x1.class
            i95.m r0 = i95.n0.c(r0)
            wf0.x1 r0 = (wf0.x1) r0
            java.lang.String r7 = r7.z0()
            vf0.y1 r0 = (vf0.y1) r0
            r0.getClass()
            t21.v2 r7 = t21.d3.h(r7)
            if (r7 == 0) goto L2e
            int r0 = r7.f415008f
            long r3 = (long) r0
        L2e:
            r0 = 1
            fk4.u r6 = r6.f201205c
            if (r6 == 0) goto L3d
            fk4.k r6 = (fk4.k) r6
            boolean r6 = r6.h()
            if (r6 != r0) goto L3d
            r6 = r0
            goto L3e
        L3d:
            r6 = r8
        L3e:
            if (r6 != 0) goto L4d
            if (r7 == 0) goto L4a
            boolean r6 = r7.i()
            if (r6 != r0) goto L4a
            r6 = r0
            goto L4b
        L4a:
            r6 = r8
        L4b:
            if (r6 == 0) goto L4f
        L4d:
            r5 = r0
            goto L50
        L4f:
            r5 = r8
        L50:
            com.tencent.mm.ui.chatting.gallery.nb r6 = new com.tencent.mm.ui.chatting.gallery.nb
            r0 = r6
            r0.<init>(r1, r3, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ub.a(com.tencent.mm.ui.chatting.gallery.ub, java.lang.String, yz5.a):com.tencent.mm.ui.chatting.gallery.nb");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableStringBuilder b(com.tencent.mm.ui.chatting.gallery.ub r18, android.content.Context r19, java.lang.String r20, com.tencent.mm.ui.chatting.gallery.ob r21, com.tencent.mm.ui.chatting.gallery.nb r22, com.tencent.mm.ui.chatting.gallery.mb r23) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ub.b(com.tencent.mm.ui.chatting.gallery.ub, android.content.Context, java.lang.String, com.tencent.mm.ui.chatting.gallery.ob, com.tencent.mm.ui.chatting.gallery.nb, com.tencent.mm.ui.chatting.gallery.mb):android.text.SpannableStringBuilder");
    }

    public final android.text.SpannableStringBuilder c(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, int i17, boolean z17) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i17), length, spannableStringBuilder.length(), 33);
        if (z17) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final android.text.SpannableStringBuilder d(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, java.lang.String str2, int i17, int i18) {
        c(spannableStringBuilder, str + ' ', i17, false);
        c(spannableStringBuilder, str2, i18, true);
        spannableStringBuilder.append("\n");
        return spannableStringBuilder;
    }
}
