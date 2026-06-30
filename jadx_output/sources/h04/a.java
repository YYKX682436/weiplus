package h04;

/* loaded from: classes9.dex */
public abstract class a {
    public volatile android.os.CancellationSignal cancellationSignal;

    public abstract void onTaskCanceled();

    public abstract boolean onTaskExecute(android.os.CancellationSignal cancellationSignal);
}
