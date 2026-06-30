package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f193236b = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.smiley.EmojiDrawableBitmapRepo$MMTrimMemoryEventListener f193237a;

    static {
        lp0.b.s();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.smiley.EmojiDrawableBitmapRepo$MMTrimMemoryEventListener] */
    public e(kotlin.jvm.internal.i iVar) {
        com.tencent.mm.smiley.EmojiDrawableBitmapRepo$MMTrimMemoryEventListener emojiDrawableBitmapRepo$MMTrimMemoryEventListener = this.f193237a;
        if (emojiDrawableBitmapRepo$MMTrimMemoryEventListener != null) {
            emojiDrawableBitmapRepo$MMTrimMemoryEventListener.dead();
        }
        ?? r17 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(this) { // from class: com.tencent.mm.smiley.EmojiDrawableBitmapRepo$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f193210d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(com.tencent.mm.app.a0.f53288d);
                kotlin.jvm.internal.o.g(this, "target");
                this.f193210d = new java.lang.ref.WeakReference(this);
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                com.tencent.mm.autogen.events.MMTrimMemoryEvent event = mMTrimMemoryEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (((com.tencent.mm.smiley.e) this.f193210d.get()) != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiDrawableBitmapRepo", "received MMTrimMemoryEvent: EmojiDrawableBitmapRepo");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("received MMTrimMemoryEvent: clear cache size:");
                    gr.q qVar = gr.q.f274676a;
                    gr.r rVar = gr.q.f274677b;
                    sb6.append(rVar.b(false));
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiDrawableBitmapRepo", sb6.toString());
                    rVar.a(false);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDrawableBitmapRepo", "received MMTrimMemoryEvent: EmojiDrawableBitmapRepo was gone");
                    dead();
                    int i17 = com.tencent.mm.smiley.e.f193236b;
                    com.tencent.mm.smiley.d.f193233a.f193237a = null;
                }
                return false;
            }
        };
        this.f193237a = r17;
        r17.alive();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable a(com.tencent.mm.smiley.a1 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.e.a(com.tencent.mm.smiley.a1, boolean):android.graphics.drawable.Drawable");
    }
}
