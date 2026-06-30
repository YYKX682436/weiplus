package mc5;

/* loaded from: classes3.dex */
public final class x implements com.tencent.mm.ui.chatting.gallery.d1 {
    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public boolean Fc(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        kotlin.jvm.internal.o.g(sourceImgInfo, "sourceImgInfo");
        return sourceImgInfo.f71259e == 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: Exception -> 0x0010, TRY_LEAVE, TryCatch #0 {Exception -> 0x0010, blocks: (B:17:0x0007, B:9:0x0016), top: B:16:0x0007 }] */
    @Override // com.tencent.mm.ui.chatting.gallery.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ob(com.tencent.mm.modelmulti.SourceImgInfo r3, boolean r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r3 = r3.f71258d
            if (r3 == 0) goto L12
            boolean r4 = r26.n0.N(r3)     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto Le
            goto L12
        Le:
            r4 = 0
            goto L13
        L10:
            r3 = move-exception
            goto L28
        L12:
            r4 = 1
        L13:
            if (r4 == 0) goto L16
            return
        L16:
            cl0.g r4 = new cl0.g     // Catch: java.lang.Exception -> L10
            r4.<init>(r3)     // Catch: java.lang.Exception -> L10
            zv4.m r3 = zv4.m.f476481a     // Catch: java.lang.Exception -> L10
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L10
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)     // Catch: java.lang.Exception -> L10
            r3.c(r0, r4)     // Catch: java.lang.Exception -> L10
            goto L2b
        L28:
            r3.getMessage()
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mc5.x.Ob(com.tencent.mm.modelmulti.SourceImgInfo, boolean):void");
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String Ze(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.Integer valueOf = sourceImgInfo != null ? java.lang.Integer.valueOf(sourceImgInfo.f71259e) : null;
        if (valueOf == null || valueOf.intValue() != 16) {
            return "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pjn);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String dd(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.Integer valueOf = sourceImgInfo != null ? java.lang.Integer.valueOf(sourceImgInfo.f71259e) : null;
        if (valueOf == null || valueOf.intValue() != 16) {
            return "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pjn);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String ge(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.Integer valueOf = sourceImgInfo != null ? java.lang.Integer.valueOf(sourceImgInfo.f71259e) : null;
        if (valueOf == null || valueOf.intValue() != 16) {
            return "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pjn);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
