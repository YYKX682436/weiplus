package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes12.dex */
public class PopEmojiView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView f190816d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f190817e;

    public PopEmojiView(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c_u, null);
        this.f190817e = viewGroup;
        com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView mMEmojiView = (com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView) viewGroup.findViewById(com.tencent.mm.R.id.h88);
        this.f190816d = mMEmojiView;
        mMEmojiView.setIsMaxSizeLimit(true);
        this.f190816d.setMaxSize(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480391wm) - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx) * 3));
        addView(this.f190817e, -1, -1);
    }

    public void setEmojiInfo(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        com.tencent.mm.plugin.gif.b uVar;
        com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView mMEmojiView = this.f190816d;
        if (mMEmojiView != null) {
            mMEmojiView.f190812n = emojiInfo;
            java.lang.String N0 = emojiInfo.N0();
            if ((emojiInfo.field_reserved4 & 1) != 1) {
                mMEmojiView.v(N0, true, "");
                return;
            }
            lt0.f fVar = (lt0.f) com.tencent.mm.plugin.gif.d.c().f142129b;
            if ((fVar.get("") != null ? (com.tencent.mm.plugin.gif.b) ((java.lang.ref.WeakReference) fVar.get("")).get() : null) != null) {
                lt0.f fVar2 = (lt0.f) com.tencent.mm.plugin.gif.d.c().f142129b;
                mMEmojiView.setImageDrawable(fVar2.get("") != null ? (com.tencent.mm.plugin.gif.b) ((java.lang.ref.WeakReference) fVar2.get("")).get() : null);
                return;
            }
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = mMEmojiView.f190812n;
            byte[] z17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z(mMEmojiView.f190812n);
            mMEmojiView.f190812n = emojiInfo2;
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.M0(z17)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0("")) {
                        uVar = (com.tencent.mm.sdk.platformtools.y1.h(z17) && ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().e()) ? new com.tencent.mm.plugin.gif.u(z17) : new com.tencent.mm.plugin.gif.k(z17, false);
                        if (!uVar.isRunning()) {
                            uVar.c();
                        }
                    } else {
                        mMEmojiView.setCacheKey("");
                        uVar = com.tencent.mm.plugin.gif.d.c().b(mMEmojiView.getCacheKey(), z17);
                    }
                    mMEmojiView.setImageDrawable(uVar);
                    return;
                }
            } catch (com.tencent.mm.plugin.gif.MMGIFException e17) {
                mMEmojiView.s(e17);
                if (e17.getErrorCode() == 103) {
                    android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(z17);
                    if (G != null) {
                        G.setDensity(mMEmojiView.getEmojiDensity());
                        mMEmojiView.setImageBitmap(G);
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", z17.toString());
                    com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = mMEmojiView.f190812n;
                    if (emojiInfo3 != null) {
                        emojiInfo3.w();
                        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmojiView", "delete file.");
                    }
                    mMEmojiView.n();
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e17.toString());
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo4 = mMEmojiView.f190812n;
                if (emojiInfo4 != null) {
                    emojiInfo4.w();
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmojiView", "delete file.");
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e18.toString());
            } catch (java.lang.NullPointerException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e19.toString());
            }
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo5 = mMEmojiView.f190812n;
            if (emojiInfo5 != null) {
                emojiInfo5.w();
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmojiView", "delete file.");
            }
            mMEmojiView.n();
        }
    }

    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        if (this.f190816d == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.setDensity(this.f190816d.getEmojiDensity());
        this.f190816d.setImageBitmap(bitmap);
    }

    public void setImageResource(int i17) {
        com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView mMEmojiView = this.f190816d;
        if (mMEmojiView != null) {
            mMEmojiView.setImageResource(i17);
        }
    }

    public PopEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PopEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
