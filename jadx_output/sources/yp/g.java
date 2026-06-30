package yp;

/* loaded from: classes10.dex */
public abstract class g {
    public static yp.j a(android.view.View view, yp.i iVar, boolean z17, boolean z18) {
        if (view instanceof android.view.SurfaceView) {
            return new yp.m((android.view.SurfaceView) view, iVar, z18);
        }
        if (view instanceof android.view.TextureView) {
            return new yp.n((android.view.TextureView) view, z17);
        }
        if (view instanceof com.tencent.mm.danmaku.render.NativeDanmakuView) {
            return new yp.l((com.tencent.mm.danmaku.render.NativeDanmakuView) view);
        }
        return null;
    }
}
