package n3;

/* loaded from: classes9.dex */
public abstract class m {
    public static void a(android.view.DragAndDropPermissions dragAndDropPermissions) {
        dragAndDropPermissions.release();
    }

    public static android.view.DragAndDropPermissions b(android.app.Activity activity, android.view.DragEvent dragEvent) {
        return activity.requestDragAndDropPermissions(dragEvent);
    }
}
