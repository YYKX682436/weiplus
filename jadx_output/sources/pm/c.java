package pm;

/* loaded from: classes8.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue notificationQueue$ParcelNotificationQueue = new com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue();
        int readInt = parcel.readInt();
        for (int i17 = 0; i17 < readInt; i17++) {
            notificationQueue$ParcelNotificationQueue.add((com.tencent.mm.booter.notification.NotificationItem) parcel.readParcelable(com.tencent.mm.booter.notification.NotificationItem.class.getClassLoader()));
        }
        return notificationQueue$ParcelNotificationQueue;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue[i17];
    }
}
