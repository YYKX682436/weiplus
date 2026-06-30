package cw2;

/* loaded from: classes2.dex */
public interface ba {
    static /* synthetic */ void a(cw2.ba baVar, float f17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStopSeek");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) baVar).O(f17, z17);
    }
}
