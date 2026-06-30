package com.tencent.tinker.loader.hotplug;

/* loaded from: classes13.dex */
public class ActivityStubManager {
    private static final int NOTRANSPARENT_SLOT_INDEX = 0;
    private static final java.lang.String TAG = "Tinker.ActivityStubManager";
    private static final int TRANSPARENT_SLOT_INDEX = 1;
    private static java.util.Map<java.lang.String, java.lang.String> sTargetToStubClassNameMap = new java.util.HashMap();
    private static final int[] STANDARD_STUB_COUNT_SLOTS = {10, 3};
    private static final int[] SINGLETOP_STUB_COUNT_SLOTS = {10, 3};
    private static final int[] SINGLETASK_STUB_COUNT_SLOTS = {10, 3};
    private static final int[] SINGLEINSTANCE_STUB_COUNT_SLOTS = {10, 3};
    private static final int[] NEXT_STANDARD_STUB_IDX_SLOTS = {0, 0};
    private static final int[] NEXT_SINGLETOP_STUB_IDX_SLOTS = {0, 0};
    private static final int[] NEXT_SINGLETASK_STUB_IDX_SLOTS = {0, 0};
    private static final int[] NEXT_SINGLEINSTANCE_STUB_IDX_SLOTS = {0, 0};

    private ActivityStubManager() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.String assignStub(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        int[] iArr;
        int[] iArr2;
        java.lang.String str3 = sTargetToStubClassNameMap.get(str);
        if (str3 != null) {
            return str3;
        }
        char c17 = 1;
        if (i17 == 1) {
            str2 = com.tencent.tinker.loader.hotplug.ActivityStubs.SINGLETOP_STUB_CLASSNAME_FORMAT;
            iArr = NEXT_SINGLETOP_STUB_IDX_SLOTS;
            iArr2 = SINGLETOP_STUB_COUNT_SLOTS;
        } else if (i17 == 2) {
            str2 = com.tencent.tinker.loader.hotplug.ActivityStubs.SINGLETASK_STUB_CLASSNAME_FORMAT;
            iArr = NEXT_SINGLETASK_STUB_IDX_SLOTS;
            iArr2 = SINGLETASK_STUB_COUNT_SLOTS;
        } else if (i17 != 3) {
            str2 = com.tencent.tinker.loader.hotplug.ActivityStubs.STARDARD_STUB_CLASSNAME_FORMAT;
            iArr = NEXT_STANDARD_STUB_IDX_SLOTS;
            iArr2 = STANDARD_STUB_COUNT_SLOTS;
        } else {
            str2 = com.tencent.tinker.loader.hotplug.ActivityStubs.SINGLEINSTANCE_STUB_CLASSNAME_FORMAT;
            iArr = NEXT_SINGLEINSTANCE_STUB_IDX_SLOTS;
            iArr2 = SINGLEINSTANCE_STUB_COUNT_SLOTS;
        }
        int i18 = 0;
        if (z17) {
            str2 = str2 + "_T";
        } else {
            c17 = 0;
        }
        int i19 = iArr[c17];
        iArr[c17] = i19 + 1;
        if (i19 >= iArr2[c17]) {
            iArr[c17] = 0;
        } else {
            i18 = i19;
        }
        java.lang.String format = java.lang.String.format(str2, java.lang.Integer.valueOf(i18));
        sTargetToStubClassNameMap.put(str, format);
        return format;
    }
}
