package com.tencent.mm.xeffect.effect;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eJ\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082 J)\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0082 J)\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0082 J\t\u0010\u0012\u001a\u00020\u0002H\u0082 J\u0019\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0082 J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0082 J\u0019\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0019\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0082 J\u0011\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/xeffect/effect/EffectManager;", "", "", "ptr", "", "type", "nCreateEffect", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "nCreateEffectPath", "", "bytes", "length", "nCreateEffectBinary", "Landroid/content/res/AssetManager;", "asset", "assetPath", "nCreateEffectAsset", "nInit", "effectPtr", "nAddEffect", "effectId", "Ljz5/f0;", "nBringToFront", "nRemoveEffect", "nProfileData", "Lcom/tencent/mm/xeffect/effect/IStickerDecoderFactory;", "factory", "nSetDecoderFactory", "nDestroy", "uq5/g", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class EffectManager {

    /* renamed from: c, reason: collision with root package name */
    public static final uq5.g f214804c = new uq5.g(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f214805a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f214806b = new java.util.LinkedList();

    static {
        tq5.k.a("xlabeffect");
        tq5.k.a("pag");
        uq5.e eVar = new uq5.e();
        if (tq5.k.f421272a) {
            nSetDefaultFactory(new com.tencent.mm.xeffect.effect.StickerDecoderFactoryWrapper(eVar));
        }
    }

    public EffectManager() {
        boolean z17 = tq5.k.f421272a;
        this.f214805a = tq5.k.f421272a ? nInit() : 0L;
    }

    private final native long nAddEffect(long ptr, long effectPtr);

    private final native void nBringToFront(long j17, long j18);

    private final native long nCreateEffect(long ptr, int type);

    private final native long nCreateEffectAsset(long ptr, int type, android.content.res.AssetManager asset, java.lang.String assetPath);

    private final native long nCreateEffectBinary(long ptr, int type, byte[] bytes, long length);

    private final native long nCreateEffectPath(long ptr, int type, java.lang.String path);

    private final native void nDestroy(long j17);

    private final native long nInit();

    private final native long nProfileData(long ptr);

    private final native void nRemoveEffect(long j17, long j18);

    private final native void nSetDecoderFactory(long j17, com.tencent.mm.xeffect.effect.IStickerDecoderFactory iStickerDecoderFactory);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nSetDefaultFactory(com.tencent.mm.xeffect.effect.IStickerDecoderFactory iStickerDecoderFactory);

    public final uq5.b b() {
        uq5.y g17 = g(uq5.k.BlurEffect);
        if (g17 == null) {
            throw new jz5.q("null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
        }
        uq5.b bVar = (uq5.b) g17;
        c(bVar);
        return bVar;
    }

    public final uq5.y c(uq5.y yVar) {
        if (yVar != null) {
            long j17 = this.f214805a;
            if (j17 != 0) {
                long nAddEffect = nAddEffect(j17, yVar.f430269c);
                yVar.f430267a = nAddEffect;
                com.tencent.mm.xeffect.XEffectLog.f214803a.i("EffectManager", "addEffect ptr:" + yVar.f430269c + ", effectId:" + nAddEffect, new java.lang.Object[0]);
                synchronized (this.f214806b) {
                    this.f214806b.add(yVar);
                }
            }
        }
        return yVar;
    }

    public final uq5.m d() {
        uq5.y g17 = g(uq5.k.GradientBlurEffect);
        if (g17 == null) {
            throw new jz5.q("null cannot be cast to non-null type com.tencent.mm.xeffect.effect.GradientBlurEffect");
        }
        uq5.m mVar = (uq5.m) g17;
        mVar.d(20.0f);
        c(mVar);
        return mVar;
    }

    public final void e(long j17) {
        if (this.f214805a == 0) {
            return;
        }
        synchronized (this.f214806b) {
            java.util.Iterator it = this.f214806b.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((uq5.y) it.next()).f430267a == j17) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 >= 0) {
                java.lang.Object remove = this.f214806b.remove(i17);
                kotlin.jvm.internal.o.c(remove, "effectList.removeAt(index)");
                this.f214806b.add((uq5.y) remove);
            }
            nBringToFront(this.f214805a, j17);
        }
    }

    public final void f() {
        if (this.f214805a == 0) {
            return;
        }
        synchronized (this.f214806b) {
            for (uq5.y yVar : this.f214806b) {
                nRemoveEffect(this.f214805a, yVar.f430267a);
                yVar.f430267a = 0L;
            }
            this.f214806b.clear();
        }
    }

    public final uq5.y g(uq5.k type) {
        kotlin.jvm.internal.o.h(type, "type");
        long j17 = this.f214805a;
        uq5.g gVar = f214804c;
        return j17 == 0 ? uq5.g.a(gVar, 0L, type) : uq5.g.a(gVar, nCreateEffect(j17, type.ordinal()), type);
    }

    public final uq5.y h(uq5.k type, android.content.res.AssetManager asset, java.lang.String assetPath) {
        kotlin.jvm.internal.o.h(type, "type");
        kotlin.jvm.internal.o.h(asset, "asset");
        kotlin.jvm.internal.o.h(assetPath, "assetPath");
        long j17 = this.f214805a;
        uq5.g gVar = f214804c;
        return j17 == 0 ? uq5.g.a(gVar, 0L, type) : uq5.g.a(gVar, nCreateEffectAsset(j17, type.ordinal(), asset, assetPath), type);
    }

    public final uq5.y i(uq5.k type, java.lang.String path) {
        kotlin.jvm.internal.o.h(type, "type");
        kotlin.jvm.internal.o.h(path, "path");
        long j17 = this.f214805a;
        uq5.g gVar = f214804c;
        return j17 == 0 ? uq5.g.a(gVar, 0L, type) : uq5.g.a(gVar, nCreateEffectPath(j17, type.ordinal(), path), type);
    }

    public final uq5.y j(uq5.k type, byte[] bytes) {
        kotlin.jvm.internal.o.h(type, "type");
        kotlin.jvm.internal.o.h(bytes, "bytes");
        long j17 = this.f214805a;
        uq5.g gVar = f214804c;
        if (j17 == 0) {
            return uq5.g.a(gVar, 0L, type);
        }
        long nCreateEffectBinary = nCreateEffectBinary(j17, type.ordinal(), bytes, bytes.length);
        uq5.y a17 = uq5.g.a(gVar, nCreateEffectBinary, type);
        com.tencent.mm.xeffect.XEffectLog.f214803a.i("EffectManager", "create effect binary ptr:" + nCreateEffectBinary + ", type:" + type + ", " + bytes.length, new java.lang.Object[0]);
        return a17;
    }

    public final void k() {
        f();
        long j17 = this.f214805a;
        if (j17 == 0) {
            return;
        }
        nDestroy(j17);
    }

    public final uq5.y l(long j17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f214806b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((uq5.y) obj).f430267a == j17) {
                break;
            }
        }
        return (uq5.y) obj;
    }

    public final com.tencent.mm.xeffect.effect.EffectProfileData m() {
        long j17 = this.f214805a;
        return j17 == 0 ? new com.tencent.mm.xeffect.effect.EffectProfileData(0L) : new com.tencent.mm.xeffect.effect.EffectProfileData(nProfileData(j17));
    }

    public final void n(long j17) {
        if (this.f214805a == 0) {
            return;
        }
        synchronized (this.f214806b) {
            java.util.Iterator it = this.f214806b.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else {
                    if (((uq5.y) it.next()).f430267a == j17) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 >= 0) {
                com.tencent.mm.xeffect.XEffectLog.f214803a.i("EffectManager", "removeEffect ptr:" + ((uq5.y) this.f214806b.get(i17)).f430269c + ", effectId:" + j17, new java.lang.Object[0]);
                ((uq5.y) this.f214806b.get(i17)).f430267a = 0L;
                this.f214806b.remove(i17);
            }
            nRemoveEffect(this.f214805a, j17);
        }
    }

    public final void o(uq5.y yVar) {
        if (this.f214805a == 0 || yVar == null) {
            return;
        }
        synchronized (this.f214806b) {
            this.f214806b.remove(yVar);
            nRemoveEffect(this.f214805a, yVar.f430267a);
        }
    }

    public final void p(uq5.k type) {
        kotlin.jvm.internal.o.h(type, "type");
        synchronized (this.f214806b) {
            java.util.LinkedList linkedList = this.f214806b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (((uq5.y) obj).c() == type) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o((uq5.y) it.next());
            }
        }
    }

    public final void q(com.tencent.mm.xeffect.effect.IStickerDecoderFactory factory) {
        kotlin.jvm.internal.o.h(factory, "factory");
        long j17 = this.f214805a;
        if (j17 == 0) {
            return;
        }
        nSetDecoderFactory(j17, new com.tencent.mm.xeffect.effect.StickerDecoderFactoryWrapper(factory));
    }

    public EffectManager(long j17, kotlin.jvm.internal.i iVar) {
        this.f214805a = j17;
    }
}
