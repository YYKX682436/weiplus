package com.tencent.plugin.finder.detector.api.detect;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lls5/m;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/plugin/finder/detector/api/detect/BaseEventDetector;", "<init>", "()V", "plugin-finder-detector_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class FinderEventDetector<T extends ls5.m> extends com.tencent.plugin.finder.detector.api.detect.BaseEventDetector<T> {
    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.lang.Object q(ns5.a aVar, java.util.Map.Entry entry, com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct finderLiveErrorReportStruct, kotlin.coroutines.Continuation continuation) {
        ls5.k eventDetectorAdapter;
        ls5.f fVar = (ls5.f) entry.getValue();
        if (fVar != null && (eventDetectorAdapter = ((ls5.m) fVar.f321131a).getEventDetectorAdapter()) != null) {
            java.lang.String leakMsg = k(fVar, aVar);
            ls5.d dVar = (ls5.d) eventDetectorAdapter;
            kotlin.jvm.internal.o.g(leakMsg, "leakMsg");
            dVar.f321123c = leakMsg;
            dVar.f321124d = java.lang.System.currentTimeMillis();
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return jz5.f0.f302826a;
    }

    public boolean r(android.view.View view) {
        if (view != null) {
            java.lang.String str = "isFloatMode view: " + view + " it.rootView = " + view.getRootView() + " layoutParams: " + view.getRootView().getLayoutParams();
            java.lang.String str2 = this.f215227e;
            com.tencent.mars.xlog.Log.i(str2, str);
            android.view.ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                com.tencent.mars.xlog.Log.i(str2, "isFloatMode type = " + layoutParams2.type + " isShown: " + view.isShown());
                if (layoutParams2.type > 99) {
                    return true;
                }
            }
        }
        return false;
    }
}
