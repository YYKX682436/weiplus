package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MultiStageCitySelectUI f210486d;

    public i7(com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI) {
        this.f210486d = multiStageCitySelectUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.MultiStageCitySelectUI multiStageCitySelectUI = this.f210486d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(multiStageCitySelectUI.B)) {
            return;
        }
        new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region : com.tencent.mm.ui.tools.MultiStageCitySelectUI.F) {
            if (regionCodeDecoder$Region.getName() != null && regionCodeDecoder$Region.getName().contains(multiStageCitySelectUI.B)) {
                if (!"CN".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) && !"HK".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) && !"MO".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) && !"TW".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode())) {
                    if (regionCodeDecoder$Region.getParent() == null || !regionCodeDecoder$Region.hasChildren()) {
                        if (regionCodeDecoder$Region.getParent() != null && !regionCodeDecoder$Region.hasChildren()) {
                        }
                    }
                }
                if (!multiStageCitySelectUI.C.contains(regionCodeDecoder$Region.getCountryCode()) && (regionCodeDecoder$Region.getParent() == null || (!"HK".equalsIgnoreCase(regionCodeDecoder$Region.getParent().getCode()) && !"MO".equalsIgnoreCase(regionCodeDecoder$Region.getParent().getCode()) && !"TW".equalsIgnoreCase(regionCodeDecoder$Region.getParent().getCode())))) {
                    if (regionCodeDecoder$Region.getParent() == null || !("CN".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) || "HK".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) || "MO".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) || "TW".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()))) {
                        if (regionCodeDecoder$Region.getParent() == null && ("HK".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) || "MO".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()) || "TW".equalsIgnoreCase(regionCodeDecoder$Region.getCountryCode()))) {
                            arrayList.add(regionCodeDecoder$Region);
                        } else {
                            arrayList.add(regionCodeDecoder$Region);
                        }
                    } else if (regionCodeDecoder$Region.hasChildren() && regionCodeDecoder$Region.getParent() != null) {
                        arrayList2.add(regionCodeDecoder$Region);
                    } else if (!regionCodeDecoder$Region.hasChildren() && regionCodeDecoder$Region.getParent() != null) {
                        arrayList3.add(regionCodeDecoder$Region);
                    }
                }
            }
        }
        if (arrayList3.size() > 0) {
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(multiStageCitySelectUI, null);
            preferenceTitleCategory.J(com.tencent.mm.R.string.iom);
            ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).d(preferenceTitleCategory, -1);
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region2 = (com.tencent.mm.storage.RegionCodeDecoder$Region) it.next();
                com.tencent.mm.ui.tools.ZonePreference zonePreference = new com.tencent.mm.ui.tools.ZonePreference(multiStageCitySelectUI, null);
                regionCodeDecoder$Region2.setHasChildren(false);
                zonePreference.N(regionCodeDecoder$Region2);
                ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).f(zonePreference, -1);
            }
        }
        if (arrayList2.size() > 0) {
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory2 = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(multiStageCitySelectUI, null);
            preferenceTitleCategory2.J(com.tencent.mm.R.string.ioo);
            ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).d(preferenceTitleCategory2, -1);
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region3 = (com.tencent.mm.storage.RegionCodeDecoder$Region) it6.next();
                com.tencent.mm.ui.tools.ZonePreference zonePreference2 = new com.tencent.mm.ui.tools.ZonePreference(multiStageCitySelectUI, null);
                zonePreference2.N(regionCodeDecoder$Region3);
                ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).f(zonePreference2, -1);
            }
        }
        if (arrayList.size() > 0) {
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory3 = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(multiStageCitySelectUI, null);
            preferenceTitleCategory3.J(com.tencent.mm.R.string.ion);
            ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).d(preferenceTitleCategory3, -1);
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.storage.RegionCodeDecoder$Region regionCodeDecoder$Region4 = (com.tencent.mm.storage.RegionCodeDecoder$Region) it7.next();
                com.tencent.mm.ui.tools.ZonePreference zonePreference3 = new com.tencent.mm.ui.tools.ZonePreference(multiStageCitySelectUI, null);
                zonePreference3.N(regionCodeDecoder$Region4);
                ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).f(zonePreference3, -1);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) multiStageCitySelectUI.f210093d).notifyDataSetChanged();
        multiStageCitySelectUI.f210101o = 4;
    }
}
