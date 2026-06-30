package rx4;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401158a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f401159b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401160c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f401161d;

    public h(org.json.JSONObject raw, boolean z17) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401158a = raw;
        this.f401159b = z17;
        this.f401160c = "";
        this.f401161d = new java.util.ArrayList();
        java.lang.String optString = raw.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401160c = optString;
    }

    public final void a(java.util.List liveItems) {
        int i17;
        kotlin.jvm.internal.o.g(liveItems, "liveItems");
        if (liveItems.isEmpty() || !this.f401159b) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", "FTSHistoryBlock updateByLive, liveItems: " + liveItems.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List V0 = kz5.n0.V0(this.f401161d);
        java.util.Iterator it = liveItems.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            rx4.j jVar = (rx4.j) it.next();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            java.util.Iterator it6 = arrayList2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    i17 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(((rx4.i) it6.next()).f401186b, jVar.f401201c)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 != -1) {
                rx4.i iVar = (rx4.i) arrayList2.remove(i17);
                java.lang.String str = iVar.f401190f;
                iVar.f401191g = jVar.f401205g;
                iVar.f401193i = jVar.f401204f;
                java.lang.String str2 = jVar.f401203e;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                iVar.f401192h = str2;
                java.lang.String str3 = jVar.f401200b;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                iVar.f401190f = str3;
                java.lang.String str4 = jVar.f401202d;
                kotlin.jvm.internal.o.g(str4, "<set-?>");
                iVar.f401187c = str4;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] updateByLive override, hotword=");
                java.lang.String str5 = iVar.f401186b;
                sb6.append(str5);
                sb6.append(", oldSearchId='");
                sb6.append(str);
                sb6.append("', newSearchId='");
                sb6.append(str3);
                sb6.append('\'');
                com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
                arrayList.add(iVar);
                if (iVar.f401191g) {
                    com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", "add LiveItem, matchedItem, hotword: " + str5 + ", isLive: " + iVar.f401191g + ", tagType: " + iVar.f401193i + ", tagTitle: " + iVar.f401192h + "searchId: " + iVar.f401190f);
                }
            }
        }
        arrayList.addAll(V0);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[hitest] updateByLive done, items.size=");
        sb7.append(arrayList.size());
        sb7.append(", withSearchId=");
        if (!arrayList.isEmpty()) {
            java.util.Iterator it7 = arrayList.iterator();
            int i18 = 0;
            while (it7.hasNext()) {
                if ((((rx4.i) it7.next()).f401190f.length() > 0) && (i18 = i18 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
            i17 = i18;
        }
        sb7.append(i17);
        com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", sb7.toString());
        this.f401161d.clear();
        this.f401161d.addAll(arrayList);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.h)) {
            return false;
        }
        rx4.h hVar = (rx4.h) obj;
        return kotlin.jvm.internal.o.b(this.f401158a, hVar.f401158a) && this.f401159b == hVar.f401159b;
    }

    public int hashCode() {
        return (this.f401158a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f401159b);
    }

    public java.lang.String toString() {
        return "FTSHistoryBlock(raw=" + this.f401158a + ", isNewStyle=" + this.f401159b + ')';
    }
}
