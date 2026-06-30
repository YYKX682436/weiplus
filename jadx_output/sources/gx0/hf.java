package gx0;

/* loaded from: classes5.dex */
public abstract class hf extends du0.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static /* synthetic */ void V6(gx0.hf hfVar, com.tencent.maas.base.MJID mjid, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyNewStyle");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        hfVar.U6(mjid, aVar);
    }

    public static /* synthetic */ void b7(gx0.hf hfVar, zw0.d dVar, com.tencent.maas.model.time.MJTime InvalidTime, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leaveEditingStateForAll");
        }
        if ((i17 & 1) != 0) {
            dVar = null;
        }
        if ((i17 & 2) != 0) {
            InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        }
        hfVar.a7(dVar, InvalidTime);
    }

    public static /* synthetic */ java.lang.Object d7(gx0.hf hfVar, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: leaveTitleEditingState");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return hfVar.c7(z17, continuation);
    }

    public static /* synthetic */ boolean h7(gx0.hf hfVar, com.tencent.maas.base.MJID mjid, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeSegment");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        return hfVar.g7(mjid, z17, z18);
    }

    public void U6(com.tencent.maas.base.MJID mjID, yz5.a aVar) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
    }

    public void W6(com.tencent.maas.base.MJID mjID, com.tencent.maas.model.time.MJTimeRange timeRange, yz5.a aVar) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
    }

    public void X6(com.tencent.maas.model.time.MJTime previewTime) {
        kotlin.jvm.internal.o.g(previewTime, "previewTime");
    }

    public final com.tencent.maas.model.time.MJTimeRange Y6(ug.m segmentType) {
        kotlin.jvm.internal.o.g(segmentType, "segmentType");
        switch (segmentType) {
            case None:
            case Transition:
            case MovieClip:
            case VideoClip:
            case ImageClip:
            case Music:
            case Narration:
            case Caption:
                com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
                return new com.tencent.maas.model.time.MJTimeRange(mJTime, mJTime);
            case MovieTitle:
                double Ri = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ri();
                return new com.tencent.maas.model.time.MJTimeRange(e7(), !java.lang.Double.isInfinite(Ri) && !java.lang.Double.isNaN(Ri) ? com.tencent.maas.model.time.MJTime.fromSeconds(((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Ri()) : com.tencent.maas.model.time.MJTime.fromSeconds(2.0d));
            case ContentDesc:
            case FancyText:
            case WhenWhere:
            case Emoticon:
                return new com.tencent.maas.model.time.MJTimeRange(e7(), f7());
            default:
                throw new jz5.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Z6(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        if (!(segment instanceof ug.d)) {
            return false;
        }
        ug.d dVar = (ug.d) segment;
        if (!dVar.l() || !segment.x()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("SegmentEditingStateUIC", "leaveEditingState: " + segment.C());
        dVar.j();
        return true;
    }

    public void a7(zw0.d dVar, com.tencent.maas.model.time.MJTime previewTime) {
        kotlin.jvm.internal.o.g(previewTime, "previewTime");
    }

    public java.lang.Object c7(boolean z17, kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    public com.tencent.maas.model.time.MJTime e7() {
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        return ZeroTime;
    }

    public com.tencent.maas.model.time.MJTime f7() {
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(3.0d);
        kotlin.jvm.internal.o.f(fromSeconds, "fromSeconds(...)");
        return fromSeconds;
    }

    public boolean g7(com.tencent.maas.base.MJID mjID, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        return false;
    }
}
