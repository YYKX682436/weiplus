package com.tencent.mm.xeffect.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/tencent/mm/xeffect/data/Event;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getName", "setName", "renderlib_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class Event {
    private java.lang.String description;
    private java.lang.String name;

    public Event(java.lang.String str, java.lang.String str2) {
        this.name = "";
        this.description = "";
        if (str != null) {
            this.name = str;
        }
        if (str2 != null) {
            this.description = str2;
        }
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final void setDescription(java.lang.String str) {
        kotlin.jvm.internal.o.h(str, "<set-?>");
        this.description = str;
    }

    public final void setName(java.lang.String str) {
        kotlin.jvm.internal.o.h(str, "<set-?>");
        this.name = str;
    }
}
