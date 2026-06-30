package com.tencent.mm.view.loader;

/* loaded from: classes12.dex */
public class a implements p11.o {

    /* renamed from: a, reason: collision with root package name */
    public final q11.a f213607a = new q11.a(150);

    public a() {
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>(this) { // from class: com.tencent.mm.view.loader.EmojiLoaderMemoryCache$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f213606d;

            {
                super(com.tencent.mm.app.a0.f53288d);
                this.f213606d = new java.lang.ref.WeakReference(this);
                this.__eventId = 708811463;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                int size;
                com.tencent.mm.view.loader.a aVar = (com.tencent.mm.view.loader.a) this.f213606d.get();
                if (aVar != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: EmojiLoaderMemoryCache");
                    q11.a aVar2 = aVar.f213607a;
                    if (aVar2 != null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        synchronized (aVar2) {
                            kk.j jVar = aVar2.f359530a;
                            if (jVar == null) {
                                throw new java.lang.NullPointerException("mData == null");
                            }
                            size = ((lt0.f) jVar).size();
                        }
                        objArr[0] = java.lang.Integer.valueOf(size);
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: clear [defaultImageMemoryCache][%s]", objArr);
                        kk.j jVar2 = aVar.f213607a.f359530a;
                        if (jVar2 == null) {
                            throw new java.lang.NullPointerException("mData == null");
                        }
                        ((lt0.f) jVar2).d(-1);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiLoaderMemoryCache", "received MMTrimMemoryEvent: EmojiLoaderMemoryCache was gone");
                    dead();
                }
                return false;
            }
        }.alive();
    }

    @Override // p11.o
    public void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed. key is null.");
        } else if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiLoaderMemoryCache", "[cpan] put failed.value is null.");
        } else {
            this.f213607a.a(str, bitmap);
        }
    }

    @Override // p11.o
    public void clear() {
        java.util.Map l17;
        synchronized (this) {
            q11.a aVar = this.f213607a;
            if (aVar != null) {
                synchronized (aVar) {
                    kk.j jVar = aVar.f359530a;
                    if (jVar == null) {
                        throw new java.lang.NullPointerException("mData == null");
                    }
                    l17 = ((jt0.j) jVar).l();
                }
                if (!l17.isEmpty() && l17.size() > 0) {
                    java.util.Iterator it = l17.entrySet().iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((java.util.Map.Entry) it.next()).getValue();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiLoaderMemoryCache", "recycle bitmap:%s, not need", bitmap.toString());
                        }
                    }
                }
                kk.j jVar2 = this.f213607a.f359530a;
                if (jVar2 == null) {
                    throw new java.lang.NullPointerException("mData == null");
                }
                ((lt0.f) jVar2).d(-1);
            }
        }
    }

    @Override // p11.o
    public android.graphics.Bitmap get(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        kk.j jVar = this.f213607a.f359530a;
        if (jVar != null) {
            return (android.graphics.Bitmap) ((lt0.f) jVar).get(str);
        }
        throw new java.lang.NullPointerException("mData == null");
    }

    @Override // p11.o
    public void remove(java.lang.String str) {
        kk.j jVar = this.f213607a.f359530a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        ((lt0.f) jVar).remove(str);
    }
}
