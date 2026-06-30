package com.tencent.mm.xeffect.effect;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/tencent/mm/xeffect/effect/IStickerDecoder;", "", "Landroid/util/Size;", "size", "", "duration", "time", "Ljz5/f0;", "seekTo", "Landroid/graphics/Bitmap;", "getFrame", "destroy", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public interface IStickerDecoder {
    void destroy();

    long duration();

    android.graphics.Bitmap getFrame();

    void seekTo(long j17);

    android.util.Size size();
}
