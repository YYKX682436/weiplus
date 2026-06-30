package com.tencent.mm.plugin.magicbrush.jsapi.base;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "Landroid/os/Parcelable;", "Event", "FinalCallback", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$Event;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$FinalCallback;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class CallbackType implements android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$Event;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final /* data */ class Event extends com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.Event> CREATOR = new com.tencent.mm.plugin.magicbrush.jsapi.base.a();

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.plugin.magicbrush.base.MBJsEventBase f148042d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(com.tencent.mm.plugin.magicbrush.base.MBJsEventBase event) {
            super(null);
            kotlin.jvm.internal.o.g(event, "event");
            this.f148042d = event;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.Event) && kotlin.jvm.internal.o.b(this.f148042d, ((com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.Event) obj).f148042d);
        }

        public int hashCode() {
            return this.f148042d.hashCode();
        }

        public java.lang.String toString() {
            return "Event(event=" + this.f148042d + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            kotlin.jvm.internal.o.g(out, "out");
            out.writeParcelable(this.f148042d, i17);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType$FinalCallback;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final /* data */ class FinalCallback extends com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.FinalCallback> CREATOR = new com.tencent.mm.plugin.magicbrush.jsapi.base.b();

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ipcinvoker.type.IPCString f148043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinalCallback(com.tencent.mm.ipcinvoker.type.IPCString callbackStr) {
            super(null);
            kotlin.jvm.internal.o.g(callbackStr, "callbackStr");
            this.f148043d = callbackStr;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.FinalCallback) && kotlin.jvm.internal.o.b(this.f148043d, ((com.tencent.mm.plugin.magicbrush.jsapi.base.CallbackType.FinalCallback) obj).f148043d);
        }

        public int hashCode() {
            return this.f148043d.hashCode();
        }

        public java.lang.String toString() {
            return "FinalCallback(callbackStr=" + this.f148043d + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            kotlin.jvm.internal.o.g(out, "out");
            out.writeParcelable(this.f148043d, i17);
        }
    }

    public CallbackType(kotlin.jvm.internal.i iVar) {
    }
}
