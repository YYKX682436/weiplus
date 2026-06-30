package kotlin.coroutines;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/coroutines/Continuation;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface Continuation<T> {
    oz5.l getContext();

    void resumeWith(java.lang.Object obj);
}
