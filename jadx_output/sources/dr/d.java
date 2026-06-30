package dr;

/* loaded from: classes12.dex */
public final class d extends dr.p {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f242378g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242379h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.tencent.mm.storage.emotion.EmojiInfo r3, com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "emojiInfo"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "cacheKey"
            kotlin.jvm.internal.o.g(r5, r0)
            sr.a r0 = r4.getDelegate()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.emoji.loader.request.IRequest.Callback"
            kotlin.jvm.internal.o.e(r0, r1)
            r2.<init>(r3, r4, r0)
            r2.f242378g = r5
            r3 = 1
            r2.f242379h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.d.<init>(com.tencent.mm.storage.emotion.EmojiInfo, com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView, java.lang.String):void");
    }

    @Override // dr.p, dr.s
    public void c(boolean z17) {
        android.graphics.drawable.Drawable drawable;
        java.lang.ref.WeakReference weakReference = this.f242402c;
        java.util.Objects.toString(weakReference != null ? (com.tencent.mm.emoji.view.AbsEmojiView) weakReference.get() : null);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f242400a;
        kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        java.lang.ref.WeakReference weakReference2 = this.f242402c;
        com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = weakReference2 != null ? (com.tencent.mm.emoji.view.AbsEmojiView) weakReference2.get() : null;
        if (z17) {
            br.a aVar = new br.a();
            kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            drawable = aVar.b((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, new dr.b(this));
        } else {
            drawable = null;
        }
        if (drawable == null && this.f242379h) {
            this.f242379h = false;
            dr.s.e(this, false, 1, null);
            return;
        }
        final dr.a aVar2 = new dr.a(this, drawable, absEmojiView, z17);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            aVar2.invoke();
        } else {
            com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a.d(new java.lang.Runnable(aVar2) { // from class: dr.e

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f242380d;

                {
                    kotlin.jvm.internal.o.g(aVar2, "function");
                    this.f242380d = aVar2;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f242380d.invoke();
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (kotlin.jvm.internal.o.b(r2, r3 != null ? (com.tencent.mm.emoji.view.AbsEmojiView) r3.get() : null) != false) goto L23;
     */
    @Override // dr.p, dr.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r5) {
        /*
            r4 = this;
            com.tencent.mm.sdk.platformtools.r2 r5 = ar.b.f13355a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "get "
            r5.<init>(r0)
            java.lang.String r0 = r4.f242378g
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "MicroMsg.EmojiLoader.AnimateCache"
            com.tencent.mars.xlog.Log.i(r1, r5)
            r5 = 0
            if (r0 != 0) goto L1b
            goto L2c
        L1b:
            com.tencent.mm.sdk.platformtools.r2 r1 = ar.b.f13355a
            java.lang.Object r0 = r1.get(r0)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L2d
        L2c:
            r0 = r5
        L2d:
            java.util.Objects.toString(r0)
            java.lang.ref.WeakReference r1 = r4.f242402c
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r1.get()
            com.tencent.mm.emoji.view.AbsEmojiView r1 = (com.tencent.mm.emoji.view.AbsEmojiView) r1
            goto L3c
        L3b:
            r1 = r5
        L3c:
            java.util.Objects.toString(r1)
            r1 = 1
            if (r0 == 0) goto L84
            android.graphics.drawable.Drawable$Callback r2 = r0.getCallback()
            if (r2 == 0) goto L5e
            android.graphics.drawable.Drawable$Callback r2 = r0.getCallback()
            java.lang.ref.WeakReference r3 = r4.f242402c
            if (r3 == 0) goto L57
            java.lang.Object r3 = r3.get()
            com.tencent.mm.emoji.view.AbsEmojiView r3 = (com.tencent.mm.emoji.view.AbsEmojiView) r3
            goto L58
        L57:
            r3 = r5
        L58:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            if (r2 == 0) goto L84
        L5e:
            java.lang.ref.WeakReference r5 = r4.f242402c
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r5.get()
            com.tencent.mm.emoji.view.AbsEmojiView r5 = (com.tencent.mm.emoji.view.AbsEmojiView) r5
            if (r5 == 0) goto L6d
            r5.setImageDrawable(r0)
        L6d:
            java.lang.ref.WeakReference r5 = r4.f242402c
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r5.get()
            com.tencent.mm.emoji.view.AbsEmojiView r5 = (com.tencent.mm.emoji.view.AbsEmojiView) r5
            if (r5 == 0) goto L7c
            r5.resume()
        L7c:
            dr.q r5 = r4.f242397d
            if (r5 == 0) goto L99
            r5.a(r1)
            goto L99
        L84:
            com.tencent.mm.api.IEmojiInfo r0 = r4.f242400a
            boolean r0 = r0.E0()
            if (r0 == 0) goto L95
            dr.c r0 = new dr.c
            r0.<init>(r4)
            pm0.v.K(r5, r0)
            goto L99
        L95:
            r0 = 0
            dr.s.e(r4, r0, r1, r5)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.d.f(boolean):void");
    }
}
